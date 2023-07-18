#!/bin/bash

# utils
log(){
  echo "[jenkins-local] - $1"
}

log "Preparing environment..."

# define env file
if [ ! -f $PWD/.env.jenkins ]; then
  log "Creating env file (you have to update it manually)"
  cp .env.template .env.jenkins
fi

# generate keys
if [ ! -f $PWD/src/secret-files/ssh-local-key ]; then
  log "Generating base keys"
  . $PWD/scripts/generate_ssh_keys.sh
fi

# build agents
agents_folder="$PWD/src/agents"

log "Checking agents..."

find "$agents_folder" -type d -mindepth 1 -maxdepth 1 | while read -r folder_path; do
    # Perform action on each folder
    agent_name=$(basename "$folder_path")

    # check images
    if docker inspect "$agent_name" &> /dev/null; then
      log ">> Image '${agent_name}' already exists"
    else
      cd $folder_path
      log ">> Building image: $agent_name"
      docker build -t "$agent_name" .
    fi
done

# start environment
log "Starting up..."
docker-compose up -d
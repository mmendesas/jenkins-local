#!/bin/bash -e

## enable sh on local host

declare -a SSH_NAMES=( "ssh-local-key" "ssh-agent-key" )

for name in "${SSH_NAMES[@]}"
do
    ssh-keygen -q -f "${PWD}/src/secret-files/${name}" -N ""
    cat "${PWD}/src/secret-files/${name}.pub" >> ~/.ssh/authorized_keys
done
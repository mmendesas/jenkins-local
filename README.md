# JENKINS LOCAL

A helper repo to test/validate your jenkins pipeline on your `local environment`

## Getting started

You can use this repo to start your jenkins with agents in your local machine with `docker`

1. update env vars according to your needs
   - `$ cp .env.template jenkins.env`
2. enable local host communication
   - `$ ./src/scripts/gener_ate_ssh_keys.sh`
3. start jenkins_controller_main and daemon
   - `$ docker-compose up -d`

### Prerequisites

- `Enable ssh in your Mac` - Required to make your host accept ssh connection
  - System preferences > Sharing > Remote Login

### Avaiable Scripts

In the project directory, you can see the follow structure:

**`stereo/`**

## Tips and Tricks

- `yarn add --dev -W package` - Use this command inside `/stereo` to install package in workspace. After that you only need to add it in your `package` dependency.

## Built With

- [Docker](https://www.docker.com/)  - The Monorepo manager
- [JCASC](https://www.jenkins.io/projects/jcasc/)  -  Jenkins configuration as code
- [docker-plugin](https://plugins.jenkins.io/docker-plugin/)  -  docker plugin for jenkins

## Author

- **Marcio Mendes** - [mmendesas](https://github.com/mmendesas)

## License

This project is licensed under the MIT License

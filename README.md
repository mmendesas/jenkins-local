# JENKINS LOCAL

Automated CI/CD structure with jenkins and docker to test/validate your pipeline `locally`

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

## Built With

- [Docker](https://www.docker.com/)  - Container platform
- [JCASC](https://www.jenkins.io/projects/jcasc/)  -  Jenkins configuration as code
- [docker-plugin](https://plugins.jenkins.io/docker-plugin/)  -  docker plugin for jenkins

## Author

- **Marcio Mendes** - [mmendesas](https://github.com/mmendesas)

## License

This project is licensed under the MIT License

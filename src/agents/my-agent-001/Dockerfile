# Custom Agent 001
#
#  Example of custom agent - using attach strategy
#  see jenkins/agent repo for more details
FROM jenkins/agent:alpine

# use root to install deps
USER root
RUN apk add --update npm nodejs

# move back to base user
USER jenkins
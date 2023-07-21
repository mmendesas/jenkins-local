# Custom Agent 002
#
#  Example of custom agent - using attach strategy
#  see jenkins/agent repo for more details
FROM jenkins/agent:alpine

# use root to install deps
USER root

RUN apk add --update openjdk11 --repository=http://dl-cdn.alpinelinux.org/alpine/edge/community

# move back to base user
USER jenkins
FROM jenkins/jenkins:lts

## skip setup wizard
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

## install plugins
COPY ./config/plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --clean-download-directory --list --view-security-warnings -f /usr/share/jenkins/ref/plugins.txt

WORKDIR $JENKINS_HOME

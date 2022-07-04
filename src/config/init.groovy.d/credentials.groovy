// #!groovy
import com.cloudbees.plugins.credentials.impl.*
import com.cloudbees.plugins.credentials.*
import com.cloudbees.plugins.credentials.domains.*
import com.cloudbees.jenkins.plugins.sshcredentials.impl.*

/*
 * This script loads credentials
 */

//  read file content
def getContent(filePath) {
    return new File(filePath).text
}

// This function reads the contents of a key file and returns
// a Jenkins SSH private key object with the given user as owner
def getSSHKeyCredential(id, path, user) {
    def source = new BasicSSHUserPrivateKey.DirectEntryPrivateKeySource(getContent(path))
    return new BasicSSHUserPrivateKey(
        CredentialsScope.GLOBAL,
        id,
        user,
        source,
        '',
        "SSH key ${id}"
    )
}

///////////////
// Add ssh keys
///////////////
sshKeys = [
    [id: 'ssh-agent-key', path: '/var/jenkins_home/secret-files/ssh-agent-key', user: 'jenkins'],
    [id: 'ssh-local-key', path: '/var/jenkins_home/secret-files/ssh-local-key', user: 'jenkins'],
]

for (sshKey in sshKeys) {
    SystemCredentialsProvider.getInstance().getStore().addCredentials(Domain.global(), getSSHKeyCredential(sshKey.id, sshKey.path, sshKey.user))
}

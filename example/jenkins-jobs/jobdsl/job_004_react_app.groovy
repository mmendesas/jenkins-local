pipelineJob('job_004_react_app') {
  description 'Build a job from jenkinsfile inside real project'
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("${LOCAL_USER}@host.docker.internal:${LOCAL_WORKSPACE}/jenkins-app-test/.git")
            credentials('ssh-local-key')
          }
        }
      }
      scriptPath('Jenkinsfile')
    }
  }
}

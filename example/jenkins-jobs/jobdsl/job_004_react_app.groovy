pipelineJob('job_004_react_app') {
  description 'Build a job from jenkinsfile inside real project'
  definition {
    // cps {
    //   script(readFileFromWorkspace('example/app01/Jenkinsfile'))
    //   sandbox()
    // }
    // }
    // }
    cpsScm {
      scm {
        git {
          remote {
            url("${LOCAL_USER}@host.docker.internal:${LOCAL_JOBS}/.git")
            credentials('ssh-local-key')
          }
        }
      }
      scriptPath('example/app01/Jenkinsfile')
    }
  }
}

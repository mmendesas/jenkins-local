pipelineJob('job_003_another_agent') {
  description 'Mapping to jenkinsfile inside workspace'
  definition {
    cps {
      script(readFileFromWorkspace('example/jenkins-jobs/declarative/sample002.Jenkinsfile'))
      sandbox()
    }
  }
}

pipelineJob('job_test_003') {
  description 'Mapping to jenkinsfile inside workspace'
  definition {
    cps {
      script(readFileFromWorkspace('example/jenkins-jobs/declarative/sample001.Jenkinsfile'))
      sandbox()
    }
  }
}

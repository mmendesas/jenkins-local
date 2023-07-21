pipelineJob('job_003_file_from_workspace') {
  description 'Mapping to jenkinsfile inside workspace'
  definition {
    cps {
      script(readFileFromWorkspace('example/jenkins-jobs/declarative/sample001.Jenkinsfile'))
      sandbox()
    }
  }
}

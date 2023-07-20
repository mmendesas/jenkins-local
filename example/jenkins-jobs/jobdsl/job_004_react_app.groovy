pipelineJob('job_004_react_app') {
  description 'Build a job from jenkinsfile inside real project'
  definition {
    cps {
      script(readFileFromWorkspace('example/app01/Jenkinsfile'))
      sandbox()
    }
  }
}

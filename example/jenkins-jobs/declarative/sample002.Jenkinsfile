pipeline {
  agent { label 'agent-002' }
  options {
    timeout(time: 20, unit: 'SECONDS')
  }
  stages {
    stage('Testing another agent image') {
      steps {
        echo 'Running a declarative Jenkinsfile example from workspace file'
        sh 'pwd'
        sh 'java -version'
        echo 'Finish job 005'
      }
    }
  }
}

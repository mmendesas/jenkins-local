pipeline {
  agent any
  options {
    timeout(time: 20, unit: 'SECONDS')
  }
  stages {
    stage('Prepare') {
      steps {
        echo 'Running a declarative Jenkinsfile example from workspace file'
        sh 'pwd'
        sh 'ls -lash'
        echo 'Finish job 003'
      }
    }
  }
}

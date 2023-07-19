pipeline {
  agent any
  options {
    timeout(time: 20, unit: 'SECONDS')
  }
  stages {
    stage('Prepare') {
      steps {
        echo 'Running a declarative Jenkinsfile example'
        sh 'ls -lash'
      }
    }
  }
}

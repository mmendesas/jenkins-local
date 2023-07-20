pipeline {
  agent { label 'agent-001' }
  environment {
    CI = 'true'
  }
  stages {
    stage('Prepare') {
      steps {
        sh 'pwd'
        sh 'whoami'
        sh 'ls -lash'
        sh 'npm install'
      }
    }
    stage('Test') {
      steps {
        sh 'npm test'
      }
    }
  }
}

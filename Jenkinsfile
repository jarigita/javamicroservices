pipeline {
  agent any
  stages {
    stage('begin') {
      steps {
        echo 'start PRU1'
      }
    }

    stage('Build') {
      steps {
        echo 'Build'
        sh 'mvn clean package'
      }
    }

    stage('End') {
      steps {
        echo 'End'
      }
    }

  }
  environment {
    version = '0.1'
  }
}
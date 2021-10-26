pipeline {
  agent any
  stages {
    stage('Begin') {
      steps {
        echo 'Iniciando projecto AA'
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

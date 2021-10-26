pipeline {
  agent any
  stages {
    stage('begin') {
      steps {
        echo 'start PRU1'
        sh 'echo $JAVA_HOME'
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
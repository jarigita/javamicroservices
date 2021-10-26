pipeline {
  agent any
  stages {
    stage('set JAVA_PATH') {
      steps {
        sh 'export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64'
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
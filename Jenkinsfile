pipeline {
  agent any
  tools {
    maven '/home/arigita/WORK/java/idea-IC-201.6668.121/plugins/maven/lib/maven3/bin/mvn' 
  }
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

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
        sh 'mvn clean install surefire-report:report'
      }
    }

    stage('End') {
      steps {
        // publish html
        publishHTML target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: 'unit test',
            reportFiles: 'surefire-report.html',
            reportName: 'Unit test Report'
          ]

        echo 'End'
      }
    }

  }
  environment {
    version = '0.1'
  }
}

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
        sh 'mvn -Dmaven.test.failure.ignore clean package'
        stash(name: 'build-test-artifacts', includes: '**/target/surefire-reports/TEST-*.xml,target/*.jar.')
      }
    }

    stage('report & publish') {
      steps {
        unstash 'build-test-artifacts'
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts(artifacts: 'target/*.jar', onlyIfSuccessful: true)
      }
    }

  }
  environment {
    version = '0.1'
  }
}
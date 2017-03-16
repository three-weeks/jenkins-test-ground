pipeline {
  agent any

  environment {
    gitUrl = ''
    repo = ''
  }

  stages {
    stage('Unsash') {
      steps { unstash 'assets' }
    }
    stage('Setup Environment') {
      steps {
        load './setup.groovy'
      }
    }

    stage('Dev') {
      steps {
        load './dev.groovy'
      }
    }

    stage('Test') {
      steps {
        load './test.groovy'
      }
    }

    stage('UAT') {
      steps {
        load './uat.groovy'
      }
    }

    stage('Prod') {
      steps {
        load './prod.groovy'
      }
    }
  }
  post {
    always {
      echo 'Done!'
    }
  }
}

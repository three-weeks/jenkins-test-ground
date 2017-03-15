pipeline {
  agent any
  
  stages {
    stage('dev') {
      steps {
        load './dev.groovy'
      }
    }
  }
  post {
    always {
      echo 'Done!'
    }
  }
}

pipeline {
  agent any
  
  stages {
    stage('dev') {
      load './dev.groovy'
    }
  }
  post {
    always {
      echo 'Done!'
    }
  }
}

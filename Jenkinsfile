pipeline {
  agent any
  
  stages {
    load './dev.groovy'
  }
  post {
    always {
      echo 'Done!'
    }
  }
}

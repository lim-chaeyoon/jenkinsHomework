pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh './gradlew compileJava'
      }
    }

    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }

    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }

  }
}
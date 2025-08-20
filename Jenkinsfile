pipeline {
  agent any
  environment {
    COMPOSE_DOCKER_CLI_BUILD = '1'
    DOCKER_BUILDKIT = '1'
  }
  stages {
    stage('Checkout') { steps { checkout scm } }
    stage('Build Backend') {
      steps {
        dir('backend') {
          sh 'mvn -q -DskipTests clean package'
        }
      }
    }
    stage('Docker Compose Build') { steps { sh 'docker compose build' } }
    stage('Docker Compose Up') { steps { sh 'docker compose up -d' } }
  }
  post {
    always {
      sh 'docker compose ps'
    }
  }
}

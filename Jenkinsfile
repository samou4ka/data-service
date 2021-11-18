pipeline {
    agent any
    stages {
        stage('Checkout Source') {
            steps {
                git url:'https://github.com/samou4ka/data-service.git', branch:'master'
            }
        }

        stage('Cloning Git') {
              steps {
                git 'https://github.com/samou4ka/data-service.git'
              }
        }

        stage("Build image") {
             steps {
                 script {
                      myapp = docker.build("samou4ka/data-service:${env.BUILD_ID}")
                 }
             }
        }

        stage("Push image") {
             steps {
                  script {
                       docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                            myapp.push("latest")
                       }
                  }
             }
        }
    }
}
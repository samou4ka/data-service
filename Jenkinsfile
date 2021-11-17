pipeline {
    agent any
    stages {
        stage('Checkout Source') {
            steps {
                git url:'https://github.com/samou4ka/data-service.git', branch:'master'
            }
        }

        stage("Build image") {
             steps {
                 script {
                      echo "success build"
                 }
             }
        }

        stage("Push image") {
             steps {
                  script {
                           echo "success push"
                       }
                  }
             }
        }
    }
}
pipeline {
    agent any

    stages {
        stage('Stateless: Build') {
            steps {
                dir('stateless'){
                        sh './gradlew clean test build'
                }
            }
        }
        stage('Stateful: Build') {
            steps {
                dir('stateful'){
                        sh './gradlew clean test build'
                }
            }
        }
    }
}

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
    }
}

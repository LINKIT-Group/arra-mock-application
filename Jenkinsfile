pipeline {
    agent {
        docker {
            image 'openjdk:8-jdk-slim'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Stateless: Build') {
            steps {
                dir('stateless'){
                        sh './build.sh'
                }
            }
        }
        stage('Stateful: Build') {
            steps {
                dir('stateful'){
                        sh './build.sh'
                }
            }
        }
	stage('Frontend: Build') {
	    agent {
                docker { image 'node:8-slim' }
            }
            steps {
                dir('frontend'){
                        sh './build.sh'
                }
            }
        }
    }
}

pipeline {
    agent any    
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
            steps {
                dir('frontend'){
                        sh 'echo "We need docker or node here!"'
                }
            }
        }
    }
}

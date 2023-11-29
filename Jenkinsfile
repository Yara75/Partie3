pipeline {
    agent any

    stages {
        stage('Build and Run Main') {
            steps {
                script {
                    sh 'javac Main.java'
                    sh 'java Main'
                }
            }
        }
    }

    post {
        always {
        }
    }
}

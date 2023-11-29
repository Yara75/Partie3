pipeline {
    agent any

    stages {
        stage('Build and Run Main') {
            steps {
                script {
                    sh 'javac Br2.java'
                    sh 'java Br2'
                }
            }
        }
    }
}

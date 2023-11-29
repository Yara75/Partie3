pipeline {
    agent any

    stages {
        stage('Build and Run Main') {
            steps {
                script {
                    sh 'javac Br3.java'
                    sh 'java Br3'
                }
            }
        }
    }
}

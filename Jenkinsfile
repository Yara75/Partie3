pipeline {
    agent any

    stages {
        stage('Build/Run') {
            steps {
                script {
                    sh 'javac Br2.java'
                    sh 'java Br2'
                }
            }
        }
    }
}

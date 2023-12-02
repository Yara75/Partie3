pipeline {
    agent any

    stages {
        stage('Build/Run') {
            steps {
                script {
                    sh 'javac Br3.java'
                    sh 'java Br3'
                }
            }
        }
    }
}

// Jenkinsfile pour la branche Main
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
        // Ajoutez d'autres étapes au besoin
    }

    post {
        always {
            // Actions à effectuer toujours après l'exécution du pipeline
        }
    }
}

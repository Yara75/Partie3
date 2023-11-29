// Jenkinsfile pour la branche Main
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
        // Ajoutez d'autres étapes au besoin
    }

    post {
        always {
            // Actions à effectuer toujours après l'exécution du pipeline
        }
    }
}

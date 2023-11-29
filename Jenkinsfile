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

        stage('Lister les variables') {
            steps {
                script {
                    env.USER = 'JU_TH_DO'
                    env.COLOR = 'Blue'
                }
            }
        }

        stage('Utilisation des variables') {
            steps {
                script {
                    // Utiliser les variables dans une étape distincte
                    echo "USER = ${USER}"
                    echo "COLOR = ${COLOR}"
                }
            }
        }
    }
}

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
                    env.LOISIR = 'Lecture'
                    env.COLOR = 'Green'
                    echo "USER = ${USER}"
                    echo "COLOR = ${COLOR}"
                    echo "LOISIR = ${LOISIR}"
                }
            }
        }
    }
}

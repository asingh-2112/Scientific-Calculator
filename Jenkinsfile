pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                script {
                    git branch: 'main',
                        credentialsId: 'github-token',  // Use the credentials ID
                        url: 'https://github.com/yourusername/Scientific_Calculator.git'
                }
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}

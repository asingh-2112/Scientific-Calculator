pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "https://github.com/asingh-2112/Scientific-Calculator.git"
                }
            }
        }
            stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("calculator", '.')
                }
            }
        }
            stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'dockerhub') {
                    sh 'docker tag calculator asingh2112/calculator:latest'
                    sh 'docker push asingh2112/calculator'
                    }
                 }
            }
        }
        stage('Run Ansible Playbook') {
                    steps {
                        script {
                            ansiblePlaybook(
                                playbook: 'deploy.yml',
                                inventory: 'ansible'
                            )
                        }
                    }
                }
    }
}

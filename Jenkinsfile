pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git credentialsId: 'github-ssh-key', url: 'git@github.com:asingh-2112/Scientific-Calculator.git', branch: 'main'
            }
        }
    }
}

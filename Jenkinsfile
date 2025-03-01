pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git credentialsId: 'github-token', url: 'https://github.com/yourusername/Scientific_Calculator.git', branch: 'main'
            }
        }
    }
}

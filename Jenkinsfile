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
    }
}

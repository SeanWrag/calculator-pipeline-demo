pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t calculator-pipeline-demo .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker run --rm calculator-pipeline-demo'
            }
        }
    }
}
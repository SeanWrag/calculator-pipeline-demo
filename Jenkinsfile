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
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t calculator-pipeline-demo .'
            }
        }

        stage('Docker Run') {
            steps {
                sh 'docker run --rm calculator-pipeline-demo'
            }
        }
    }
}
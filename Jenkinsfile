pipeline {
    agent any

    tools {
        maven 'Maven 3.9.12'
    }

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
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
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Deploy to Staging') {
            steps {
                echo 'Application deployed to STAGING environment successfully.'
            }
        }

        stage('Approval for Production') {
            steps {
                input message: 'Approve deployment to Production?'
            }
        }

        stage('Deploy to Production') {
            steps {
                echo 'Application deployed to PRODUCTION environment successfully.'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }

        failure {
            echo 'Pipeline failed. Please investigate.'
        }
    }
}
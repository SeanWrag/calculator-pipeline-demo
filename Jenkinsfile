node {

    stage('Checkout') {
        git branch: 'main', url: 'https://github.com/SeanWrag/calculator-pipeline-demo.git'
    }

    stage('Build') {
        bat 'mvn clean compile'
    }

    stage('Test') {
        bat 'mvn test'
    }

    stage('Package') {
        bat 'mvn package'
    }

    stage('Deploy to Staging') {
        echo 'Application deployed to STAGING environment successfully.'
    }

    stage('Approval for Production') {
        input 'Approve deployment to Production?'
    }

    stage('Deploy to Production') {
        echo 'Application deployed to PRODUCTION environment successfully.'
    }

    stage('Complete') {
        echo 'Pipeline completed successfully.'
    }
}
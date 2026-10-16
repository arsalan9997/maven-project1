pipeline {
    agent any

    options {
        timestamps()
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/arsalan9997/maven-project1.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
        }

        stage('Package WAR') {
            steps {
                sh 'mvn -B package'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.war',
                                 allowEmptyArchive: false
            }
        }

        stage('Deploy to Tomcat 10') {
            steps {
                sh 'sudo cp target/*.war /opt/tomcat/webapps/'
            }
        }
    }

    post {
        success {
            echo 'Build and Tomcat deployment successful!'
        }

        failure {
            echo 'Build failed. Check Console Output.'
        }
    }
}

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
    }

    post {
        success {
            echo 'Maven build successful!'
        }

        failure {
            echo 'Build failed. Check Console Output.'
        }
    }
}

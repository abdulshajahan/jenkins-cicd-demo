pipeline {

    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3.6.3'
    }

    stages {

        stage('Checkout') {

            steps {

                echo 'Checking out source code...'

                checkout scm

            }

        }

        stage('Build') {

            steps {

                echo 'Building application...'

                sh 'mvn clean package'

            }

        }

        stage('Archive Artifact') {

            steps {

                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true

            }

        }

    }

    post {

        success {

            echo 'Build Successful'

        }

        failure {

            echo 'Build Failed'

        }

    }

}
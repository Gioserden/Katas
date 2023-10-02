pipeline {
    agent {
        docker {
            // Utiliza la imagen oficial de Jenkins con Docker
            image 'jenkins/jenkins:lts'
            // Monta el directorio del proyecto en el contenedor de Jenkins
            args '-v /var/jenkins_home/workspace/pltest2:/workspace'
        }
    }

    environment {
        // Configura el entorno para utilizar Gradle 8.1.1
        GRADLE_HOME = '/usr/local/gradle'
        PATH = "/usr/local/gradle/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio de GitHub en la ubicación de trabajo de Jenkins
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/Gioserden/Katas.git']]])
            }
        }

        stage('Install Gradle') {
            steps {
                // Descargar e instalar Gradle 8.1.1
                sh 'wget https://services.gradle.org/distributions/gradle-8.1.1-bin.zip'
                sh 'unzip gradle-8.1.1-bin.zip -d /usr/local'
                sh 'rm gradle-8.1.1-bin.zip'
            }
        }

        stage('Build') {
            steps {
                // Ejecutar Gradle dentro del proyecto clonado
                dir('/workspace') {
                    sh '/usr/local/gradle/bin/gradle clean build'
                }
            }
        }

        // Otras etapas según tus necesidades
    }

    post {
        // Acciones posteriores al pipeline
    }
}
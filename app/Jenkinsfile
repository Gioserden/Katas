pipeline {
    agent any

    environment {
        // Configura el entorno para utilizar Gradle 8.1.1
        GRADLE_HOME = '/usr/local/gradle'
        PATH = "/usr/local/gradle/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Clonar el repositorio de GitHub en la ubicación de trabajo de Jenkins
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/Gioserden/Katas.git']]])
            }
        }

        stage('Install Gradle') {
            steps {
                // Descargar e instalar Gradle 8.1.1 utilizando curl
                sh 'curl -LO https://services.gradle.org/distributions/gradle-8.1.1-bin.zip'
                sh 'unzip gradle-8.1.1-bin.zip -d ~/'
                sh 'rm gradle-8.1.1-bin.zip'
            }
        }

        stage('Build') {
            steps {
                // Ejecutar Gradle dentro del proyecto clonado
                dir('/workspace') {
                    sh '~/gradle-8.1.1/bin/gradle clean build'
                }
            }
        }

        // Otras etapas según tus necesidades
    }

    post {
        always {
            // Acciones que se ejecutan siempre, como archivar artefactos
            archiveArtifacts artifacts: '**/build/libs/*.jar', allowEmptyArchive: true
        }
        success {
            // Acciones a realizar si el pipeline se ejecuta con éxito
            emailext(
                subject: "Pipeline Exitoso",
                body: "El pipeline de construcción y pruebas se ejecutó con éxito.",
                to: 'jenkin.katas@gmail.com', // Reemplaza con la dirección de correo deseada
                mimeType: 'text/plain'
            )
        }
        failure {
            // Acciones a realizar si el pipeline falla
            emailext(
                subject: "Pipeline Fallido",
                body: "El pipeline de construcción y pruebas falló. Por favor, revisa los registros.",
                to: 'jenkin.katas@gmail.com', // Reemplaza con la dirección de correo deseada
                mimeType: 'text/plain'
            )
        }
    }
}

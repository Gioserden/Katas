# Katas
Solving katas just for practicing.

* Crear la carpeta del proyecto, si ya se tiene un repositorio con varios proyectos lo mejor es crear un carpeta. Ej: Repo
* Dentro de la carpeta del repositorio hacer un git clone del proyecto nuevo que se creo previamente en el repositorio y ingresar a la carpeta del proyecto clonado.
* Verificar que estemos con el master del proyecto con git status.
* Crear un nuevo branch y cambiar al nuevo branch con git checkout -b initialProject.
* Hacer un gradle init --type java-application y configurar como sea necesario.
* Actualizar el .gitignore si es necesario.
* Hacer el commit con el mensaje y posterior hacer el push.
* Si se va usar SonarQube revisar la parte de pluggins.

# Para cada kata
* Crear un nuevo branch desde el master actualizado con git checkout -b nombreDeLaKata 
* Hacer el commit y posterior push.

# Pluggins

* Para ver las versiones de las dependencias.
  - id 'com.github.ben-manes.versions' version '0.38.0'
	  usa ./gradlew dependencyUpdates 
  
* Análisis estático de código SonarQube.
  - id "org.sonarqube" version "4.0.0.2929" // revisar que la version sea compatible con la version de gradle que se tenga.
    sonarqube {
        properties {
            property "sonar.projectKey", "xxkeyxx"
            property "sonar.organization", "xxOrganizationxx"
            property "sonar.host.url", "https://sonarcloud.io"
        }
    }
    
  # Build.yml
  En el build.yml agregar antes del "build and analize":
	- name: gradle wrapper
        run: gradle wrapper
	// hacer un commit and push de:
	git update-index --chmod=+x gradlew // papa tener permisos de escritura gradlew.

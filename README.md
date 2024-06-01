# IAS-Test

## Descripción

Este proyecto es una API de gestión de eventos construida con Spring Boot. Proporciona endpoints para crear, leer, actualizar y eliminar eventos.

## Requisitos

- Java 17 
- Gradle
- PostgreSQL en Local

## Configuración del Proyecto

1. Clonar el repositorio:

    ```sh
    git clone https://github.com/michinthecat/IAS-Test.git
    cd IAS-Test
    ```

2. Configurar la base de datos en `application.properties`:

    ```properties
    spring.flyway.url=jdbc:postgresql://localhost:5433/iastest
    spring.flyway.user=postgres
    spring.flyway.password=postgres
    spring.flyway.locations=classpath:db/migration

    spring.r2dbc.url=r2dbc:postgresql://localhost:5433/iastest
    spring.r2dbc.username=postgres
    spring.r2dbc.password=postgres
   
    ```

3. Construir y ejecutar el proyecto:
Gradle:

    ```sh
    ./gradlew clean build
    ./gradlew bootRun
    ```

## Documentación de la API

Esta API utiliza Swagger para la documentación y prueba interactiva de endpoints. Una vez que el proyecto está en ejecución, puedes acceder a la documentación Swagger en la siguiente URL:

[http://localhost:8787/iasapi/swagger-ui/index.html](http://localhost:8787/iasapi/swagger-ui/index.html)


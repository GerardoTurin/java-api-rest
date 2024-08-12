# CRUD con Spring Boot y Hibernate

## Descripción

Este proyecto es un CRUD (Create, Read, Update, Delete) realizado con Spring Boot y Hibernate, utilizando una base de datos PostgreSQL.

## Requisitos

- Java 21
- Maven
- PostgreSQL

## Configuración

1. Clonar el repositorio
2. Crear una base de datos en PostgreSQL
3. Modificar el archivo `application.properties` con los datos de la base de datos
4. Ejecutar el proyecto

## Endpoints

- **GET** `/productos`: Obtener todos los productos
- **GET** `/productos/{id}`: Obtener un producto por ID
- **POST** `/productos`: Crear un producto
- **PUT** `/productos/{id}`: Actualizar un producto
- **DELETE** `/productos/{id}`: Eliminar un producto

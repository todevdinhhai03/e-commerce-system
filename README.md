# Fullstack web application (Microservices)
This project builds an e-commerce web application. It is created using Java and Angular.

## Services Overview

- Product Service
- Order Service
- Inventory Service
- Notification Service
- API Gateway using Spring Cloud Gateway MVC
- Shop Frontend using Angular 18

## Tech Stack

The technologies used in this project are:

- Spring Boot
- Angular
- Mongo DB
- MySQL
- Kafka
- Keycloak
- Test Containers with Wiremock
- Grafana Stack (Prometheus, Grafana, Loki and Tempo)
- API Gateway using Spring Cloud Gateway MVC

## Application Architecture
![image](https://github.com/user-attachments/assets/57ec7f82-c4bf-44bb-b90b-94be82bde1eb)


## How to run the frontend application

Make sure you have the following installed on your machine:

- Node.js
- NPM
- Angular CLI

Run the following commands to start the frontend application

```shell
cd frontend
npm install
npm run start
```
## How to build the backend services

Make sure you have docker installed on your machine

Run the following command to build and package the backend services into a docker container

```shell
mvn spring-boot:build-image 
```

## How to run backend services 

### Deploy the services
Since I have not Dockerized the Spring services, please run the following services manually: product, order, inventory, notification, and api-gateway.

### Access the Keycloak Admin Console
```shell
http://localhost:8181
```

### Access the Grafana Dashboards
```shell
http://localhost:3000
```

### Access the Api Documentation
```shell
http://localhost:9000/swagger-ui
```




<h1 align="center">
  <br>
  <a><img src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/spring-framework.png" alt="spring boot"></a>
  <br>
  Spring Boot Starter-kit
  <br>
</h1>

<h4 align="center">Production ready Starter-kit for Spring Boot applications.</h4>

<p align="center">
    <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v1.8-orange.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-v2.3.3-brightgreen.svg" />
    </a>
    <a alt="Bootstrap">
        <img src="https://img.shields.io/badge/Bootstrap-v4.0.0-yellowgreen.svg">
    </a>
    <a alt="Material">
        <img src="https://img.shields.io/badge/Material%20Design-UI-orange.svg">  
    </a>      
    <a alt="Docker">
        <img src="https://img.shields.io/badge/Docker-v19-yellowgreen.svg" />
    </a>
    <a alt="Dependencies">
        <img src="https://img.shields.io/badge/dependencies-up%20to%20date-brightgreen.svg" />
    </a>
    <a alt="Contributions">
        <img src="https://img.shields.io/badge/contributions-welcome-orange.svg" />
    </a>
    <a alt="License">
        <img src="https://img.shields.io/badge/license-MIT-blue.svg" />
    </a>
</p>

## Table of Contents ##
1. [Database Schema](#Database-Schema)
6. [Technology](#Technology)
7. [Application Structure](#Application-Structure)
8. [Run Locally](#Running-the-server-locally)
9. [Run Insider Docker](#Running-the-server-in-Docker-Container)
10. [API Documentation](#API-Documentation)
11. [User Interface](#User-Interface)
12. [Contributor](#Contributor)
13. [License](#License)

## Philosophy ##
A lot of work has gone into Spring Boot to reduce complexity and dependencies, which largely alleviates our previous reservations. If you live in a Spring ecosystem and are moving to microservices, Spring Boot is now the obvious choice. Spring Boot allows easy set up of standalone Spring-based applications. It's ideal for pulling up new microservices and easy to deploy. It also makes data access less of a pain due to the hibernate mappings with much less boilerplate code. You can get started with minimum fuss due to it taking an opinionated view of the Spring platform and third-party libraries. Most Spring Boot applications need very little Spring configuration. 

The greatest thing about Spring Boot is the ability to be up and running in very little time. You don’t have to install a web server like JBoss, Websphere, or even Tomcat for that matter. All you need to do is pull in the proper libraries, annotate, and fire away. If you are going to do a lot of Spring Boot projects, I would highly suggest using the IntelliJ IDEA IDE. It has some great features for making Boot projects really easy to manage. You can of course choose between Maven or Gradle to manage dependencies and builds. This starter kit is based on Maven as it is what I am familiar and slightly more comfortable with. 

## Application ##
This starter kit focuses on how to use Spring Boot following all the best practices that are recommended by Spring Framework 5.0, ensure the code is loosely coupled and that all the layers in the application are completely independent of each other and talk using neutral objects. While writing this kit, I have done sufficient research around the code structure and usage of appropriate design patterns to make this as an excellent starting point to begin coding your own web application.

The kit would have been incomplete if it did not have a concrete use case to implement, here I have taken a case study of a _Bus Reservation System_ and tried to implement an Admin portal which can be operated over browsers and a series of REST APIs to interact with the system using mobile applications or frontend applications written for the browsers. The complete systems has two important actors :

1. Admin user
2. End user

The _Admin user_ can access this application on browser (laptop or mobile/tablet, doesn't really matter as this is built using bootstrap, material design and is completely responsive) and can perform the following actions :

1. Signup
2. Login (Spring sessions)
3. Update their profile
4. Create an agency
5. Add buses to the agency
6. Add trips consisting of predefined stops and buses
 
The _End user_ can use their mobile application (yet to be built, however the REST APIs are ready and could be used via Postman or Swagger) to perform the following actions :

1. Signup
2. Login (and get a JWT token) 
3. List all available stops
4. Search a trip between any two stops
5. Filter search results with a date option
6. Book a ticket for a given trip schedule

Admin interface and REST APIs both have their independent authentication mechanisms, the web application uses the cookie based authentication (provided by default by Spring security) and the REST API uses the JWT authentication for access. This application assumes the availability of 'MongoDB' installation on the localhost where the server will run or the use of docker-compose to boot up a mongodb container and link the application with it within the realm of docker.

Any changes that the admin users will do on the web portal will impact the search results of the end users, there will be certain use cases which you may find missing here, I hope you will appreciate that the overall idea was to present a way to create such an application completely inside the realm of Spring Boot and not to actually building a fully functional reservation system.

The admin user interface is completely written in material design using Bootstrap v4 and is responsive to suite a variety of devices. The template engine used to render the admin views is Thymeleaf since the library is extremely extensible and its natural templating capability ensures templates can be prototyped without a back-end – which makes development very fast when compared with other popular template engines such as JSP.

## Database Schema ##
The current schema looks as follows:

<img src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/db-schema.png" alt="spring boot"></a>

- The authentication and authorization is governed by _User_ and _Role_ collection.
- The _Agency_ collection keeps the details of agency along with who owns it.
- The _Stop_ collection keeps the data about all the stops in the system.
- The _Bus_ collection has the data of all the buses for various agencies along with their capacity and make years.
- The _Trip_ and _TripSchedule_ collections keep the information about all the trips that agency owners create within the system. Information like source and destination stops, journey time, data of travel, tickets sold so far and the available seats is collected in them.
- Last, the _Ticket_ collection keeps information about all the tickets issued in the application for various trips.
  
## Technology ##
Following libraries were used during the development of this starter kit :

- **Spring Boot** - Server side framework
- **Docker** - Containerizing framework
- **MongoDB** - NoSQL database 
- **Swagger** - API documentation
- **Thymeleaf** - Templating engine
- **Material** - UI theming/design
- **Bootstrap** - CSS framework
- **JWT** - Authentication mechanism for REST APIs


## Application Structure ##

**_Models & DTOs_**

**_DAOs_**

**_Security_**

**_Controllers_**

**_Request and Form Commands_**

## Running the server locally ##
To be able to run this Spring Boot app you will need to first build it. To build and package a Spring Boot app into a single executable Jar file with a Maven, use the below command. You will need to run it from the project folder which contains the pom.xml file.

```
maven package
```
or you can also use

```
mvn install
```

To run the Spring Boot app from a command line in a Terminal window you can you the java -jar command. This is provided your Spring Boot app was packaged as an executable jar file.

```
java -jar target/springboot-starterkit-1.0.jar
```

You can also use Maven plugin to run the app. Use the below example to run your Spring Boot app with Maven plugin :

```
mvn spring-boot:run
```

If you do not have a mongo instance running and still just want to create the JAR, then please use the following command:

```
mvn install -DskipTests
```

This will skip the test cases and won't check the availability of a mongodb instance and allow you to create the JAR.

You can follow any/all of the above commands, or simply use the run configuration provided by your favorite IDE and run/debug the app from there for development purposes. Once the server is setup you should be able to access the admin interface at the following URL :

http://localhost:8080

And the REST APIs can be accessed over the following base-path :

http://localhost:8080/api/

Some of the important api endpoints are as follows :

- http://localhost:8080/api/v1/user/signup (HTTP:POST)
- http://localhost:8080/api/auth (HTTP:POST)
- http://localhost:8080/api/v1/reservation/stops (HTTP:GET)
- http://localhost:8080/api/v1/reservation/tripsbystops (HTTP:GET)
- http://localhost:8080/api/v1/reservation/tripschedules (HTTP:GET)
- http://localhost:8080/api/v1/reservation/bookticket (HTTP:POST)

## Running the server in Docker Container ##
##### Docker #####
Command to build the container :

```
docker build -t spring/starterkit .
```

Command to run the container :

```
docker run -p 8080:8080 spring/starterkit
```

Please **note** when you build the container image and if mongodb is running locally on your system, you will need to provide your system's IP address (or cloud hosted database's IP) in the application.properties file to be able to connect to the database from within the container.

##### Docker Compose #####
Another alternative to run the application is to use the docker-compose.yml file and utility. To build the application using docker-compose simply execute the following command :
```
docker-compose build
```

And to run the application, please execute the following command :
```
docker-compose up
```

## API Documentation ##
Its as important to document(as is the development) and make your APIs available in a readable manner for frontend teams or external consumers. The tool for API documentation used in this starter kit is Swagger3, you can open the same inside a browser at the following url -

http://localhost:8080/swagger-ui/index.html

It will present you with a well structured UI which has two specs :

1. User
2. BRS

You can use the User spec to execute the login api for generating the Bearer token. The token then should be applied in the "Authorize" popup which will by default apply it to all secured apis (get and post both).

<p align="center">
    <b>User Spec</b><br>
    <br>
    <img width="600" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/swagger-screens/swagger-1.png">
</p>

<p align="center">
    <b>User Login</b><br>
    <br>
    <img width="600" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/swagger-screens/swagger-2.png">
</p>

<p align="center">
    <b>Authorization</b><br>
    <br>
    <img width="600" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/swagger-screens/swagger-3.png">
</p>

<p align="center">
    <b>BRS Spec</b><br>
    <br>
    <img width="600" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/swagger-screens/swagger-4.png">
</p>

<p align="center">
    <b>BRS APIs</b><br>
    <br>
    <img width="600" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/swagger-screens/swagger-5.png">
</p>

The configuration of Swagger is being taken care of by class BrsConfiguration. I have defined two specs there with the help of "swaggerBRSApi" and "swaggerUserApi" methods. Since the login part is by default taken care of by Spring Security we don't get to expose its apis implicitly as the rest of the apis defined in the system and for the same reason I have defined a controller in the config package with the name "FakeController". Its purpose is to facilitate the generation of swagger documentation for login and logout apis, it will never come into existence during the application life cycle as the "/api/auth" api is being handled by the security filters defined in the code base. 

## User Interface ##
Here are the various screens of the Admin portal that you should be able to use once the application is setup properly :


<p align="center">
    <b>Login</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/login.png">
</p>

<p align="center">
    <b>Signup</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/signup.png">
</p>

<p align="center">
    <b>Dashboard</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/dashboard.png">
</p>

<p align="center">
    <b>Agency</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/agency.png">
</p>

<p align="center">
    <b>Buses</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/buses.png">
</p>

<p align="center">
    <b>Trips</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/trips.png">
</p>

<p align="center">
    <b>Profile</b><br>
    <br>
    <img width="800" src="https://github.com/khandelwal-arpit/springboot-starterkit/blob/master/docs/images/app-screens/profile.png">
</p>

## Contributors ##
[Arpit Khandelwal](https://www.linkedin.com/in/arpitkhandelwal1984/)

## License ##
This project is licensed under the terms of the MIT license.
# C2-GLG204-2020
This repository is for Architectures Logicielles Java(2) Project

In this I will use Thymleaf / Swift

I will Build Reservation System.
The Frontend wil be iOS swift based Application.

The Backend will include 2 parts:
    1- Admin portal 
    2- Normal User Section
    
    The Admin user can perform the following actions :

        1. Signup
        2. Login (Spring sessions)
        3. Update their profile
        4. Create an agency
        5. Add buses to the agency
        6. Add trips consisting of predefined stops and buses
        
    The End user can use their can perform the following actions :
       
       1. Signup
        2. Login (and get a JWT token)
        3. List all available stops
        4. Search a trip between any two stops
        5. Filter search results with a date option
        6. Book a ticket for a given trip schedule


The FrontEnd part firstly will be implement on iOS : (iPhone/Tablet) using swift & xcode 12.

in future I will add Thymleaf so it can be accessed from the browser.


    however the REST APIs could be used via Postman or Swagger.

    Libraries/Tools Used
    -  Following libraries were used during the development of this starter kit :
    -  Spring Boot : Server side framework
    -  Docker : Containerising framework
    -  MongoDB : NoSQL database
    -  Swagger : API documentation
    -  Swift : UI
    -  JWT : Authentication mechanism for REST APIs
    
    Start/Stop mongo : brew services stop or start mongodb-community@4.4

Some Annotations: 
                
    The @Accessors annotation is used to configure how lombok generates and looks for getters and setters. (LOMBORK) ~BIG-J Add website for LOMbork


    The @Order annotation allows the requests to be scanned through the different configurations in the specified order. So an API request goes through the ApiWebSecurityConfigurationAdapter and gets absorbed there, however an Admin request first goes through it but since it doesn’t match the criteria Spring Security tries to make it go through the next configuration with an immediate higher order which in this case is FormLoginWebSecurityConfigurerAdapter.

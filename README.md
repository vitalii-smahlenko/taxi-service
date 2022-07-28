# ![taxi](https://user-images.githubusercontent.com/85515765/180633880-382f7397-88d5-4937-bf98-1a2d128e3ee5.jpg)The Taxi-Service application.![taxi](https://user-images.githubusercontent.com/85515765/180633880-382f7397-88d5-4937-bf98-1a2d128e3ee5.jpg)

**Project description**
----
This is a simple web application of a taxi service, in which you can try yourself as a taxi driver.<br />
<br />
**In this application you can:**<br />
- Registering and authenticating as a driver;<br />
- Delete the driver;<br />
- Create a car manufacturer, and also delete it if necessary;<br />
- Create car/delete car model;<br />
- Add a driver to one or more cars;<br />
- Display all manufacturers/cars/drivers;<br />
- Display all cars belonging to the driver you are logged in for;<br />

**Instructions for launching the project:**
----
- You need to create a database. The template can be taken from ***src\main\resources\init_db.sql***<br />
  I used https://db4free.net/ alternatively you can use https://remotemysql.com/dashboard.php <br />
  or any other you like.
- Connect to the database in the ***taxi.util.ConnectionUtil*** class
- Install Apache Tomcat, I used version 9.0.50 <br />
  Apache Tomcat 9.0.50 you can download here https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/
- In order to configure logging into the project. You need to specify the path to the directory <br />
  where you want to store logs. 7 lines in the ***src/main/resources/log4j2.xml*** 

**Technologies**
----
- **Java 11.0.12 2021-07-20 LTS**<br />
- **Apache Maven 3.8.1**<br />
- **Apache Tomcat 9.0.50**
- **Apache Log4j 2.17.2**
- **Java Servlet API**
- **MySQL 8.0.29**
- **HTML**
- **SOLID Principles Java**
- **Dependency injection**

**Heroku link:**
----
***https://taxi-app-2022.herokuapp.com/***

Sportlib

is an Api rest.

It allows a lambda user to list the sports venues and their activities of a chosen city.
This person will be able to put an opinion on the sports establishment.
It must first be registered and authenticated.

It allows an external manager to create a sports venue or to create a sport activity (s).
It must first be registered and authenticated.

It allows an internal administrator to update the site.
It must first be registered and authenticated.

In a following version:
the average user can book and / or cancel a reservation.
The internal manager may cancel reservations at his sports facility.
The internal administrator will be able to output statistics.

## Installation

<strong>Back-end :</strong>  
IntelliJ IDE (is an integrated Java technology development environment)
Java jdk 1.8 (set of basic software libraries of the Java programming language)
Apache Maven 3.5.4 (allows you to compile and deploy Java applications)
MySQL Workbench 8.0 (is a database management and administration software 

<strong>Front-end :</strong>  
CLI View 3 (is a framework for building simple web applications)

## Usage  

<strong>Start the back-end :</strong>  
Of the IDE terminal> cd Sportlib / Backend
Of the IDE terminal> mvn package -Dmaven.test.skip = true (maven compiles your Sportlib project by generating a jar file)
Of the IDE terminal> cd target
Of the IDE terminal> java -jar enigma-0.0.1-SNAPSHOT.jar (execute your project in console mode) 

<strong>Start the front-end :</strong>  
Of the IDE terminal> cd Sportib / Front / sportlib
Of the IDE> npm install terminal (installs all dependencies nested on the package.json)
Of the IDE terminal> npm run serve (start your project locally)

Navigator>  http://localhost:8080/  

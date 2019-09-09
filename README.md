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
IDE IntelliJ                        (est un environnement de développement intégré de technologie Java)  
Java jdk 1.8                        (ensemble de bibliothèques logicielles de base du langage de programmation Java)  
Apache Maven 3.5.4                  (permet de compiler et de déployer des applications Java)  
MySQL Workbench 8.0                 (est un logiciel de gestion et d'administration de bases de données  

<strong>Front-end :</strong>  
Vue CLI 3                           (est un framework permettant de construire des applications web simples)  

## Usage  

<strong>Lancer la partie back-end :</strong>  
du terminal de l'IDE > cd Enigma/Backend  
du terminal de l'IDE > mvn package -Dmaven.test.skip=true   (maven compile votre projet Enigma en générant un fichier jar)  
du terminal de l'IDE > cd target  
du terminal de l'IDE > java -jar enigma-0.0.1-SNAPSHOT.jar  (execute votre projet en mode console)   

<strong>Lancer la partie front-end :</strong>  
du terminal de l'IDE > cd Enigma/Front/enigma  
du terminal de l'IDE > npm install              (installe toutes les dependences imbriqué sur le package.json)  
du terminal de l'IDE > npm run serve            (lance votre projet localement)  
Navigateur >  http://localhost:8080/  

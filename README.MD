## Simple Vertx 3 application that support configuration using typesafe-config.

### Configuration located in 

 * conf/application.conf -> common
 * conf/dev/application.conf -> dev specific
 * conf/prod/application.conf -> prod specific

 I'm extending Vertx Starter what I need to patch in method readMainVerticleFromManifest, but I hope to push it to master
 https://github.com/eclipse/vert.x/pull/1093
 
 
 ### Usage:
 
 #### Development
 
 ```
 mvn clean install
 java -jar ...-fat.jar
 ```
 
 #### Production 
 
 ```
 mvn clean install
 java -Dmode=prod -jar ...-fat.jar`
 ```
  
  
  
  
 
 
 
 
 

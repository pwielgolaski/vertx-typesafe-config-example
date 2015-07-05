## Simple Vertx 3 application that support configuration using typesafe-config.

### Configuration located in 

 * conf/application.conf - common default
 * conf/dev/application.conf - dev specific
 * conf/prod/application.conf - production specific
 
 
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
  
 #### SLF4J - logging
 
 I'm prefer to use SLF4j, so if you want to can enable it by 
 ```
 -Dvertx.logger-delegate-factory-class-name=io.vertx.core.logging.SLF4JLogDelegateFactory
 ```
 
  
  
 
 
 
 
 

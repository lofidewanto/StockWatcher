# StockWatcher

Learning from GWT tutorial on [StockWatcher](http://www.gwtproject.org/doc/latest/tutorial/gettingstarted.html) using [GWT Maven](https://tbroyer.github.io/gwt-maven-plugin/) instead of Eclipse plugin.


### stockwatcher-webapp: StockWatcher with GWT RPC and Simple Jetty Server

This example uses the Maven Archetype from TBroyer Maven plugin.

[stockwatcher-webapp](https://github.com/lofidewanto/stockwatcher/tree/master/stockwatcher-webapp)

### stockwatcher-springboot: StockWatcher with Domino REST + GWT RPC and Spring Boot

This example doesn't use the Maven Archetype from TBroyer Maven Plugin. 
- For the server part it just uses the [Spring Boot Initialzr](https://start.spring.io)
- For the client part it uses Maven from TBroyer and its integrated Jetty with [GWT Boot](https://github.com/gwtboot/gwt-boot-modules) to simplify 
the pom.xml.

[stockwatcher-springboot](https://github.com/lofidewanto/stockwatcher/tree/master/stockwatcher-springboot)

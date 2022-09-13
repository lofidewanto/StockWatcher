# StockWatcher

Learning from GWT tutorial on [StockWatcher](http://www.gwtproject.org/doc/latest/tutorial/gettingstarted.html) using [GWT Maven](https://tbroyer.github.io/gwt-maven-plugin/) instead of Eclipse plugin.


# stockwatcher-webapp: StockWatcher with GWT RPC and Simple Jetty Server

This is an example using GWT Maven Archetype from TBroyer. The result is simply using Jetty web server.

## Run in the development

Always from stockwatcher-webapp directory. If you are on the main directory go there first:

```
cd stockwatcher-webapp
```

### Build all first

```
mvn clean package
```

Result: 

![Build Result](build-result.png?raw=true "Build Result")

### Run Client GWT

```
mvn gwt:codeserver -pl *-client -am
```

### Run Server Jetty

```
mvn jetty:run -pl *-server -am -Denv=dev
```

### Start Webapp

http://localhost:8080/

![StockWatcher UI](stockwatcher-ui.png?raw=true "StockWatcher UI")

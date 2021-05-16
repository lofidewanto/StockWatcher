# StockWatcher

Learning from GWT tutorial on [StockWatcher](http://www.gwtproject.org/doc/latest/tutorial/gettingstarted.html) using [GWT Maven](https://tbroyer.github.io/gwt-maven-plugin/) instead of Eclipse plugin.


# stockwatcher-springboot: StockWatcher with GWT RPC / REST and Spring Boot Server

**Attention: GWT RPC doesn't work yet!**

## Run in the development

Always from stockwatcher-springboot directory. If you are on the main directory go there first:

```
cd stockwatcher-springboot
```

### Build all first

We need to install the shared library to be able to use it from client and server!

```
mvn clean install
```

### Run Client GWT

Go to client

```
cd stockwatcher-springboot-client
```

```
mvn gwt:generate-module gwt:devmode
```

### Run Server Spring Boot

Go to server

```
cd stockwatcher-springboot-server
```

```
mvn spring-boot:run
```

### Start Webapp

http://127.0.0.1:8888/stockwatcher/

![StockWatcher UI](stockwatcher-ui.png?raw=true "StockWatcher UI")

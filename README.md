# Hello-Socket
[![Spring Boot v3.3.5](https://img.shields.io/badge/Java-SpringBoot-green)](https://spring.io/)
[![License](http://img.shields.io/:license-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0.html)

This project created by `start.spring.io` contain [Spring Boot](https://spring.io/) version 3.3.5.

Simple implementation of WebSocket stomp-websocket

![image](https://github.com/user-attachments/assets/34791e34-3187-4fdf-a346-7b8c07a9df47)

![image](https://github.com/user-attachments/assets/ae0dd822-a379-4479-9bdd-bd3949407f91)


## Development server

Run `mvn spring-boot:run` for a dev server. Spring Boot’s embedded Apache Tomcat server is acting as a webserver and is listening for requests on `localhost` port `8080`. Open your browser and in the address bar at the top enter http://localhost:8080

## Help

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0/maven-plugin/build-image.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.0/reference/using/devtools.html)
* [WebSocket](https://docs.spring.io/spring-boot/3.4.0/reference/messaging/websockets.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.



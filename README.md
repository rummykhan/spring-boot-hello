## Spring boot Hello

This is spring boot hello application, use tomcat 9 if you want to test it on external webserver.


1. To use embedded server
```xml
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
```

2. To use external tomcat server `<packaging>war</packaging>`


```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
</dependency>
```

#### Contact
rehan_manzoor@outlook.com
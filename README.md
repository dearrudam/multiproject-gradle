# Multi-module project with Gradle

The purpose of this project is to be a sample multi-module Java + Spring Boot project with Gradle

All the components from the modules that are under the same or some sub-package of the main class annotated with @SpringBootApplication will be auto-injected;

Also, for custom purposes, you may define configuration classes and declare them into de the file ```src/resources/META-INF/spring.factories```. 

Take a loot here for more detail: [https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#features.developing-auto-configuration.understanding-auto-configured-beans](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#features.developing-auto-configuration.understanding-auto-configured-beans) 
package com.shu.nit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = { "applicationContext.xml" })
@SpringBootApplication
public class StartSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartSpringBootApplication.class, args);
    }

}

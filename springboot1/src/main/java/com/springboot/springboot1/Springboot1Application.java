package com.springboot.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Springboot1Application.class, args);

        System.out.println(run.containsBean("bean1name"));
        System.out.println(run.containsBean("tom"));

        System.out.println(run.getBean("bean2"));
    }

}
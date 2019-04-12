package com.ashin;

import com.ashin.service.DogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBootStarterApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(DemoSpringBootStarterApplication.class, args);
        System.out.println(ac.getBean(DogService.class).getDogInfo());
    }
}

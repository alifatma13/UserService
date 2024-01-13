package dev.fatma.userservicetestfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserservicetestfinalApplication {

    public static ApplicationContext context;
    public static void main(String[] args) {
            context = SpringApplication.run(UserservicetestfinalApplication.class, args);
        System.out.println("Hello World");
    }

}

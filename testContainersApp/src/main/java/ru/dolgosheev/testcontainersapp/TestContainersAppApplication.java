package ru.dolgosheev.testcontainersapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestContainersAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestContainersAppApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from container! ver. 2";
    }

}

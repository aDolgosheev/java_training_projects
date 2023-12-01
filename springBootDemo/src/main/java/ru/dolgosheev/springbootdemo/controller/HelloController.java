package ru.dolgosheev.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.dolgosheev.springbootdemo.domain.Person;

@RestController
//@ConfigurationProperties("hello")
public class HelloController {

    @Value("myApp")
    private String from;

//    public void setFrom(String from) {
//        this.from = from;
//    }

    @GetMapping("/hello")
    private String hello(@RequestParam("name") String name,
                         @RequestParam("age") int age) {
        return String.format("Hello from %s to name %s age %d!",
                from, name, age);
    }

    @PostMapping("/hello")
    private String hello(@RequestBody @Validated Person guest) {
        return String.format("Hello from %s to name %s age %d!",
                from, guest.getName(), guest.getAge());
    }

}

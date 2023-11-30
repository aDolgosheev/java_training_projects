package ru.dolgosheev.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    private String hello(@RequestBody Person guest) {
        return String.format("Hello from %s to name %s age %d!",
                from, guest.getName(), guest.getAge());
    }

}

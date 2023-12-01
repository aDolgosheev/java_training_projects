package ru.dolgosheev.springbootdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.dolgosheev.springbootdemo.domain.Person;

@RestController
@RequestMapping("/another")

public class AnotherBrokenController {

    @GetMapping("/iae")
    public String throwException() {
        throw new IllegalArgumentException("throwException");
    }

}

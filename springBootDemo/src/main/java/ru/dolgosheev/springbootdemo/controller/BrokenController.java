package ru.dolgosheev.springbootdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.dolgosheev.springbootdemo.domain.Person;

@RestController
@RequestMapping("/error")
public class BrokenController {

//    @GetMapping("/error")
//    public String error() {
//        System.out.println("Logic");
//        throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT, "ResponseStatusException");
//    }
//
//    public ResponseEntity<String>

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable("id") long id) {
        try {
            throw new IllegalArgumentException("IllegalArgumentException");
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ResponseStatusException", e);
        }
    }

    @GetMapping("/iae")
    public Person throwException() {
        throw new IllegalArgumentException("throwException");
    }

}

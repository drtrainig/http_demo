package com.itfactory;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicii/persoane")
public class SimpleRestAPI {

    @GetMapping
    public String getMethod() {
        return "GET";
    }

    @PostMapping
    public String postMapping(@RequestBody Person person) {
        System.out.println(person);
        return "POST";
    }

    @PutMapping
    public String putMapping(@RequestBody Person person) {
        System.out.println(person);
        return "PUT";
    }

    @DeleteMapping
    public String deleteMapping() {
        return "DELETE";
    }
}

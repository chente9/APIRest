package com.example.APIRest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @GetMapping
    public String hello () {
        return " <h1> Hello world <h1>" ;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return user;
    }
    @PutMapping ("/{id}")
    public User updateUser (@PathVariable String id, @RequestBody User user) {
        return user;

    }
    @DeleteMapping ("/{id}")
    public void deleteUser(@PathVariable String id) {

}
}

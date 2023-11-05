package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run hard 5k!";
    }

    @GetMapping("/something")
    public String getSomethingElse() {
        return "Something else!";
    }

    @GetMapping("/another")
    public String getSomethingAnother() {
        return "Something another else!";
    }
}

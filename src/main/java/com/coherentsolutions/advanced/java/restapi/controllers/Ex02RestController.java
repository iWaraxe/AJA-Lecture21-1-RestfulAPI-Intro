package com.coherentsolutions.advanced.java.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example demonstrating the use of @RestController.
 */
@RestController
public class Ex02RestController {

    /**
     * Handles HTTP GET requests for "/helloRest".
     * @return A greeting message as a String.
     */
    @GetMapping("/helloRest")
    public String sayHelloRest() {
        return "Hello from @RestController!";
    }
}

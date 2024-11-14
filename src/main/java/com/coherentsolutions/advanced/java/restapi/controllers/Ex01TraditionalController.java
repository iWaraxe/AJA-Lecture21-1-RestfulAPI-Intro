package com.coherentsolutions.advanced.java.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Example demonstrating the use of @Controller.
 */
@Controller
public class Ex01TraditionalController {

    /**
     * Handles HTTP GET requests for "/hello".
     * @return A greeting message as a String.
     */
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello from @Controller!";
    }
}

package com.configexample.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Value("${message.welcome}")
    private String welcome;

    @Value("${message.goodbye}")
    private String goodbye;

    @GetMapping("/welcome")
    public String welcome() {
        return welcome;
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return goodbye;
    }

}

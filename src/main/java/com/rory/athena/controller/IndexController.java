package com.rory.athena.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rory on 2018/2/7.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

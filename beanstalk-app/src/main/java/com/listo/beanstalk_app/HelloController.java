package com.listo.beanstalk_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello There!. Welcome to Listowel's Beanstalk App";
    }
}

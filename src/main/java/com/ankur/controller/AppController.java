package com.ankur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asriv5 on 10/7/16.
 */
@RestController
@RequestMapping("/hello")
public class AppController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello";
    }
}

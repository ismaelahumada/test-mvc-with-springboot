package com.securitechincluit.springbootmvc.web.controller;

import com.securitechincluit.springbootmvc.web.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/")
    public String getHelloWorld(ModelMap model) {
        model.put("message", helloWorldService.getMessage());
        return "hello-world";
    }
}

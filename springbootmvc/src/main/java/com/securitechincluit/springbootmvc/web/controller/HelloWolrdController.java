package com.securitechincluit.springbootmvc.web.controller;

import com.securitechincluit.springbootmvc.web.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWolrdController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/")
    public String getHelloWorld(ModelMap model){
        model.put("message", helloWorldService.getMessage());
        return "hello-world- con cambio";
    }

    @RequestMapping(value="/welcome", method = RequestMethod.POST)
    public String showWelcomeMessage(@RequestParam("firstName") long firstName,
                                     @RequestParam("lastName") long lastName){
        return null;

    }
}

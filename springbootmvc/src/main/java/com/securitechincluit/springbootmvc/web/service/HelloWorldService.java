package com.securitechincluit.springbootmvc.web.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getMessage(){
        return "Hola mundo!";
    }
}

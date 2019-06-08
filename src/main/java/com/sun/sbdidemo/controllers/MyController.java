package com.sun.sbdidemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getHello(){
        System.out.println("hello");
        return "foo";
    }

}

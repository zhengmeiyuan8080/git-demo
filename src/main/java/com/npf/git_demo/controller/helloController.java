package com.npf.git_demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {


    @RequestMapping("/hello")
    public String hello(@RequestParam String str){


        System.out.println("sdfsdfsdfsdfdsf");
        return "";
    }
}

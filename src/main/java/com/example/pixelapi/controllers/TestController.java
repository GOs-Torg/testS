package com.example.pixelapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/test")
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class.getName());
    @GetMapping("/sendError")
    public String sendError(){
        logger.error("Lol");
        return "error";
    }
}

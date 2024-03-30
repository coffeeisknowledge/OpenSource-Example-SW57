package com.acme.hellospringdeveloper.controllers;

import com.acme.hellospringdeveloper.model.WelcomeBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
  @GetMapping
  public String index(){
    return "HelloSpringDeveloper Application v1.0 Copyright 2024, ACME Studios. All rights reserverd";
  }
}

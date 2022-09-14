package com.example.crudWithGithubActions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping
    public List<String> getAllProducts(){
        return null;
    }

}

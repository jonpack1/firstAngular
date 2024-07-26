

/**
 * AUTHOR: Jon Pack
 * OCCC - ADVANCED JAVA
 * DATE: 07 25, 2024
 * PROJECT NAME: PostController.java
 * DESCRIPTION: post controller
 */

package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping
    public String handlePost(@RequestBody String requestBody) {
        // Process the POST request and return a response
        return "Received POST request with body: " + requestBody;
    }
}

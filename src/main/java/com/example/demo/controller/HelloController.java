

/**
 * AUTHOR: Jon Pack
 * OCCC - ADVANCED JAVA
 * DATE: 07 25, 2024
 * PROJECT NAME: HelloController.java
 * DESCRIPTION: hello controller
 */

package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/search")
    public String search(@RequestParam String query) {
        return "You searched for: " + query;
    }

    // New DELETE method
    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable String id) {
        // Simulate deleting an item
        return "Item with ID " + id + " has been deleted.";
    }

    // New PUT method
    @PutMapping("/update/{id}")
    public String updateItem(@PathVariable String id, @RequestParam String newValue) {
        // Simulate updating an item
        return "Item with ID " + id + " has been updated to " + newValue + ".";
    }

    @PostMapping("/create")
    public String createItem(@RequestBody Item item) {
        // Simulate creating a new item
        return "Created item with ID " + item.getId() + " and name " + item.getName() + ".";
    }

}



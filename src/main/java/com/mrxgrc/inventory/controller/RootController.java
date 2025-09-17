package com.mrxgrc.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, Object> getRoot() {
        return Map.of(
                "message", "Hello World! Welcome to the Inventory API",
                "endpoints", Map.of(
                        "items", "/items",
                        "getItemById", "/items/{id}",
                        "createItem", "POST /items",
                        "updateItem", "PUT /items/{id}",
                        "deleteItem", "DELETE /items/{id}",
                        "health", "/health"
                )
        );
    }
}

package com.mrxgrc.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/items")
    public List<String> getItems() {
        return List.of("Items",  "Items2");
    }
}

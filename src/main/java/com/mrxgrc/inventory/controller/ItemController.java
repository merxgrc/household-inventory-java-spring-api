package com.mrxgrc.inventory.controller;

import com.mrxgrc.inventory.model.Item;
import com.mrxgrc.inventory.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/items/{requestedId}")
    public ResponseEntity<Item> getItemById(@PathVariable Long requestedId) {
        // Call itemService.findById(requestedId) and return the appropriate response entity
        Item item = itemService.findById(requestedId);
         if (item == null) {
             return ResponseEntity.notFound().build();
         } else {
             return ResponseEntity.ok(item);
         }
    }
}

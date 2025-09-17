package com.mrxgrc.inventory.service;

import com.mrxgrc.inventory.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private final List<Item> items = new ArrayList<>();

    // Constructor
    public ItemService() {
        items.add(new Item(1L, "Hand Soap"));
        items.add(new Item(2L, "Hand Sanitizer"));
        items.add(new Item(3L, "Toilet Paper"));
    }

    public List<Item> getAllItems() {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            result.add(item);
        }
        return result;
    }

    public Item findById(Long requestedId) {
        // Retrieve the item with the given ID from list
        return items.stream()
                .filter(item -> item.getId().equals(requestedId))
                .findFirst()
                .orElse(null);
    }
}

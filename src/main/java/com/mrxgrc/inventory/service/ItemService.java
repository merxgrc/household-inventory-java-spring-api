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
        items.add(new Item(1, "Hand Soap"));
        items.add(new Item(2, "Hand Sanitizer"));
        items.add(new Item(3, "Toilet Paper"));
    }

    public List<Item> getAllItems() {

        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            result.add(item);
        }
        return result;
    }
}

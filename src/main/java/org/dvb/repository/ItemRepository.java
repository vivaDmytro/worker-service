package org.dvb.repository;

import org.dvb.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ItemRepository {

    private final List<Item> items = new ArrayList<>();

    public Optional<Item> getItem(String itemId) {
        return items.stream().filter(item -> item.getId().equals(itemId)).findFirst();
    }

    public Optional<Item> createItem(Item item) {
        item.setId(UUID.randomUUID().toString());
        items.add(item);
        return Optional.of(item);
    }
}

package org.dvb.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dvb.model.Item;
import org.dvb.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Optional<Item> getItem(String itemId) {
        log.info("Getting item: {}", itemId);
        return itemRepository.getItem(itemId);
    }

    public Optional<Item> createItem(Item item) {
        log.info("Creating item: {}", item);
        return itemRepository.createItem(item);
    }
}

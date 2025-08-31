package org.dvb.controller;

import lombok.RequiredArgsConstructor;
import org.dvb.model.Item;
import org.dvb.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/items")
public class WorkerController {

    private final ItemService itemService;

    @GetMapping("/{itemId}")
    public ResponseEntity<Item> getItem(@PathVariable String itemId) {
        return ResponseEntity.of(itemService.getItem(itemId));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return itemService.createItem(item)
                .map(created -> ResponseEntity.status(HttpStatus.CREATED).body(created))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
}

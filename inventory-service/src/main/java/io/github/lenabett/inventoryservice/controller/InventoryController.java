package io.github.lenabett.inventoryservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.lenabett.inventoryservice.model.GenericResponse;
import io.github.lenabett.inventoryservice.model.InventoryCreateDto;
import io.github.lenabett.inventoryservice.model.InventoryResponse;
import io.github.lenabett.inventoryservice.service.InventoryService;

@RequestMapping("api/inventory")
@RestController
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("create")
    public GenericResponse<InventoryResponse> create(@RequestBody InventoryCreateDto inventoryCreateDto) {
        return GenericResponse.<InventoryResponse>builder()
                .data(inventoryService.createInventory(inventoryCreateDto))
                .success(true)
                .msg("Inventory saved successfully")
                .build();
    }

}
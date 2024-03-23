package io.github.lenabett.inventoryservice.service;

import io.github.lenabett.inventoryservice.model.InventoryCreateDto;
import io.github.lenabett.inventoryservice.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);
    
}

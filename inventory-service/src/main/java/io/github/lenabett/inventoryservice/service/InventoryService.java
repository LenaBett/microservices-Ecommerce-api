package io.github.lenabett.inventoryservice.service;

import java.util.List;

import io.github.lenabett.inventoryservice.model.InventoryCreateDto;
import io.github.lenabett.inventoryservice.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);

    Boolean checkInventory(List<String> productCodes, List<Integer> productQuantities);
    
}

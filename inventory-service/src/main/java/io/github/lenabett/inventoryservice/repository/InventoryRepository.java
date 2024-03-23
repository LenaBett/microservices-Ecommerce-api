package io.github.lenabett.inventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.lenabett.inventoryservice.entity.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
    
}

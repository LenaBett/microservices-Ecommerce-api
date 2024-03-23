package io.github.lenabett.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.lenabett.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    
}

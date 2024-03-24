package io.github.lenabett.orderservice.service;

import io.github.lenabett.orderservice.model.OrderRequest;

public interface OrderService {

    String placeOrder(OrderRequest orderRequest);

    
}

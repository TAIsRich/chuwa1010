package com.example.transaction.service;

import com.example.transaction.dto.OrderRequest;
import com.example.transaction.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}

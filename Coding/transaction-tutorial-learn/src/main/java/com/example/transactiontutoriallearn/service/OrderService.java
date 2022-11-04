package com.example.transactiontutoriallearn.service;

import com.example.transactiontutoriallearn.dto.OrderRequest;
import com.example.transactiontutoriallearn.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}

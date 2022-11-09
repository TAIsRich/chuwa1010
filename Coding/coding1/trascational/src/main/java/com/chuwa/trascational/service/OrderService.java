package com.chuwa.trascational.service;

import com.chuwa.trascational.dto.OrderRequest;
import com.chuwa.trascational.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}

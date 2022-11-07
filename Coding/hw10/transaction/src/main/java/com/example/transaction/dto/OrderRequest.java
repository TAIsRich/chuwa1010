package com.example.transaction.dto;

import com.example.transaction.entity.Order;
import com.example.transaction.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}

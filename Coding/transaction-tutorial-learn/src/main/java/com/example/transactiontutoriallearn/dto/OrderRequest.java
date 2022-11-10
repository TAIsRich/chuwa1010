package com.example.transactiontutoriallearn.dto;

import com.example.transactiontutoriallearn.entity.Order;
import com.example.transactiontutoriallearn.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}

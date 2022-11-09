package com.chuwa.trascational.dto;

import com.chuwa.trascational.entity.Order;
import com.chuwa.trascational.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}

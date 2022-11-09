package com.chuwa.trascational.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String orderTrackingNumber;
    private String status;
    private String message;
}

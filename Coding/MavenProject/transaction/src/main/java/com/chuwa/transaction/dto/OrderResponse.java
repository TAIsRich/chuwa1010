package com.chuwa.transaction.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String orderTrackingNumber;
    private String Status;
    private String message;
}

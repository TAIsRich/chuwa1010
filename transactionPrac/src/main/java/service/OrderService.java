package service;

import dto.OrderRequest;
import dto.OrderResponse;
import exception.PaymentException;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest) throws PaymentException;
}

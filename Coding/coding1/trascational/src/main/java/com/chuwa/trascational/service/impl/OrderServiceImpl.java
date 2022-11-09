package com.chuwa.trascational.service.impl;

import com.chuwa.trascational.dto.OrderRequest;
import com.chuwa.trascational.dto.OrderResponse;
import com.chuwa.trascational.entity.Order;
import com.chuwa.trascational.entity.Payment;
import com.chuwa.trascational.exception.PaymentException;
import com.chuwa.trascational.repository.OrderRepository;
import com.chuwa.trascational.repository.PaymentRepository;
import com.chuwa.trascational.service.OrderService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;
    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();
        if(!payment.getType().equals("DEBIT")) {
            throw new PaymentException("Payment card type do not support!!");
        }
        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage(orderResponse.getMessage());
        return orderResponse;
    }
}

package com.example.transaction.service.impl;

import com.example.transaction.dto.OrderRequest;
import com.example.transaction.dto.OrderResponse;
import com.example.transaction.entity.Order;
import com.example.transaction.entity.Payment;
import com.example.transaction.exception.PaymentException;
import com.example.transaction.repository.OrderRepository;
import com.example.transaction.repository.PaymentRepository;
import com.example.transaction.service.OrderService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository){
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

        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type not support");

        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}

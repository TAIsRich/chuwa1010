package com.example.transactiontutoriallearn.service.impl;

import com.example.transactiontutoriallearn.dto.OrderRequest;
import com.example.transactiontutoriallearn.dto.OrderResponse;
import com.example.transactiontutoriallearn.entity.Order;
import com.example.transactiontutoriallearn.entity.Payment;
import com.example.transactiontutoriallearn.exception.PaymentException;
import com.example.transactiontutoriallearn.repository.OrderRepository;
import com.example.transactiontutoriallearn.repository.PaymentRepository;
import com.example.transactiontutoriallearn.service.OrderService;
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
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();
        if (!payment.getType().equals("DEBIT")) {
            throw new PaymentException("Payment card type do no suppurt");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}

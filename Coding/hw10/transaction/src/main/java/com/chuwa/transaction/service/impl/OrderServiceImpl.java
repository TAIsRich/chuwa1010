package com.chuwa.transaction.service.impl;

import com.chuwa.transaction.dto.OrderRequest;
import com.chuwa.transaction.dto.OrderResponse;
import com.chuwa.transaction.entity.Order;
import com.chuwa.transaction.entity.Payment;
import com.chuwa.transaction.exception.PaymentException;
import com.chuwa.transaction.repository.OrderRepository;
import com.chuwa.transaction.repository.PaymentRepository;
import com.chuwa.transaction.service.OrderService;
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
        order.setStatus("Inprogress");
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();
        if(!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }
        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("success");
        return orderResponse;
    }
}

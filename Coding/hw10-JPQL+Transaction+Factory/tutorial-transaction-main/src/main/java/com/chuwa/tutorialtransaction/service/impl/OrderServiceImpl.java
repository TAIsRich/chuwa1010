package com.chuwa.tutorialtransaction.service.impl;


import com.chuwa.tutorialtransaction.dto.OrderRequest;
import com.chuwa.tutorialtransaction.dto.OrderResponse;
import com.chuwa.tutorialtransaction.entity.Order;
import com.chuwa.tutorialtransaction.entity.Payment;
import com.chuwa.tutorialtransaction.exception.PaymentException;
import com.chuwa.tutorialtransaction.repository.OrderRepository;
import com.chuwa.tutorialtransaction.repository.PaymentRepository;
import com.chuwa.tutorialtransaction.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    // ***NOTE***
    // with @Transactional annotation,
    // if the payment method is not DEBIT, this method will throw exception, and then stops.
    // in this case, though we have already done orderRepository.save(order) to save data in order table before payment check
    //it won't really save it in DB because this @Transactional method is failed. everything done in this method will be rolled back
    // as a result, with @Transactional, operations like orderRepository.save(order); paymentRepository.save(payment);
    // will not really be saved in DB until this method is successfully returned.
    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equalsIgnoreCase("DEBIT")){
            throw new PaymentException("Payment card type do not support");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTackingNumber(order.getOrderTackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse;
    }
}

package com.chuwa.trascational.repository;

import com.chuwa.trascational.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment, Long> {
}

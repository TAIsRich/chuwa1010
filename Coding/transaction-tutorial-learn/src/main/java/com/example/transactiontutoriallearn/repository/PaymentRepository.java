package com.example.transactiontutoriallearn.repository;

import com.example.transactiontutoriallearn.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

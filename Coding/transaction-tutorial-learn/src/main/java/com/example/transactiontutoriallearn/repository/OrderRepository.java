package com.example.transactiontutoriallearn.repository;

import com.example.transactiontutoriallearn.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

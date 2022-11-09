package com.chuwa.trascational.repository;

import com.chuwa.trascational.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

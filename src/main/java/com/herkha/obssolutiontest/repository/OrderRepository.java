package com.herkha.obssolutiontest.repository;

import com.herkha.obssolutiontest.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}

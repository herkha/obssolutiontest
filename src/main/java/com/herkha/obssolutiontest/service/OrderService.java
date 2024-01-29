package com.herkha.obssolutiontest.service;

import com.herkha.obssolutiontest.entity.Order;

import java.util.List;

public interface OrderService {
    Order get(String id);
    List<Order> findAll();
    Order save(Order order);
    Boolean delete(String id);
    Order update(Order order);
    Order findById(String id);
}

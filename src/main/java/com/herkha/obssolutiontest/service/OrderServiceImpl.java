package com.herkha.obssolutiontest.service;

import com.herkha.obssolutiontest.entity.Order;
import com.herkha.obssolutiontest.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order get(String id) {
        Optional<Order> result = orderRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        List<Order> result = orderRepository.findAll();
        return result;
    }

    @Override
    public Order save(Order order) {
        orderRepository.save(order);
        return null;
    }

    @Override
    public Boolean delete(String id) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public Order findById(String id) {
        return null;
    }
}

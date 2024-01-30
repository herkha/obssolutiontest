package com.herkha.obssolutiontest.service;

import com.herkha.obssolutiontest.entity.Order;
import com.herkha.obssolutiontest.messageDTO.OrderDTO;

import java.util.List;

public interface OrderService {
    Order get(Long id);
    List<Order> findAll();
    Order save(Order order);
    Boolean delete(Long id);
    Order update(Order order);
    Order findById(Long id);
    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrdertOrderDTO(Order order);
}

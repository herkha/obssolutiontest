package com.herkha.obssolutiontest.controller;

import com.herkha.obssolutiontest.entity.Order;
import com.herkha.obssolutiontest.repository.OrderRepository;
import com.herkha.obssolutiontest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/save")
    public Order save(@RequestBody Order order){
        orderService.save(order);
        return null;
    }
}

package com.herkha.obssolutiontest.controller;

import com.herkha.obssolutiontest.entity.Order;
import com.herkha.obssolutiontest.messageDTO.OrderDTO;
import com.herkha.obssolutiontest.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/save")
    public Order save(@RequestBody OrderDTO request){
        Order order = orderService.mapOrderDTOToOrder(request) ;
        Order saved = orderService.save(order);
        return saved;
    }

    @PutMapping("/edit/{id}")
    public Order putMethodName(@PathVariable Long id, @RequestBody OrderDTO request) {
        Order result = orderService.findById(id);
        if (result != null){
            result.setItemId(request.itemId());
            result.setQty(request.qty());
            result.setOrderId(request.orderId());
            Order updated = orderService.update(result);
            return updated;
        }
        return null;
    }

    @GetMapping("/list/")
    public List<Order> list() {
        return orderService.findAll().stream().toList();
    }
    
}

package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.OrderNotFoundException;
import com.m7md.erpSystem.models.Order;
import com.m7md.erpSystem.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo) {
        super();
        this.orderRepo = orderRepo;
    }

    public Order addOrder(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> findAllOrders() {
        return orderRepo.findAll();
    }

    public Order findOrderById(long id) {
        return orderRepo.findById(id).orElseThrow(() -> new OrderNotFoundException("Order with id no: " + id + " is not found"));
    }

    public Order upgradeOrder(Order order) {
        return orderRepo.save(order);
    }

    public void deleteOrder(long id) {
        orderRepo.deleteById(id);
    }
}

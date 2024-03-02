package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.OrderRequest;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Order;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Get orders
    @GetMapping
    public List<Order> get() {
        return orderService.getAll();
    }

    // Add order
    @PostMapping
    public Order addOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.add(new Order(orderRequest.getCustomerId(),
                orderRequest.getDate(),orderRequest.getShippingAddress(),
                orderRequest.getTotalPrice()));
    }

    // Specific order operations
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable("id") int id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        if (orderService.delete(id)) {
            return "Deleted order with the id: " + id;
        }
        else
            return "Delete operation failed";
    }

    @PutMapping("/{id}")
    public String update(@RequestBody OrderRequest orderRequest, @PathVariable("id") int id) {
        if (orderService.update(id, new Order(orderRequest.getCustomerId(),
                orderRequest.getDate(),orderRequest.getShippingAddress(),
                orderRequest.getTotalPrice()))) {
            return "Updated order with the id: " + id;
        }
        else
            return "Update operation failed";
    }

}

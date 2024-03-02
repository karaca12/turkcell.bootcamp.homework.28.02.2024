package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
    Order add(Order order);
    Order getOrderById(int id);
    boolean delete(int id);
    boolean update(int id, Order order);
}

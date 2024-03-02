package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Order;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.OrderRepository;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    @Override
    public Order add(Order order) {
        return orderRepository.add(order);
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.getOrderById(id);
    }

    @Override
    public boolean delete(int id) {
        return orderRepository.delete(id);
    }

    @Override
    public boolean update(int id, Order order) {
        return orderRepository.update(id, order);
    }
}

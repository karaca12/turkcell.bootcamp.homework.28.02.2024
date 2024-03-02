package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Order;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orders;

    public OrderRepositoryImpl() {
        orders=new ArrayList<Order>();
        orders.add(new Order(1,1,new Date(),"Bursa",300));
        orders.add(new Order(2,1,new Date(),"Bursa",150));
        orders.add(new Order(3,2,new Date(),"Denizli",80));
    }

    private int generateId() {
        return orders.get(orders.size() - 1).getId() + 1;
    }

    @Override
    public List<Order> getAll() {
        return Collections.unmodifiableList(orders);
    }

//    @Override
//    public void add(Order order) {
//        orders.add(order);
//    }

    @Override
    public Order add(Order order) {
        Order newOrder = new Order(generateId(),order.getCustomerId(),order.getDate(),order.getShippingAddress(),order.getTotalPrice());
        orders.add(newOrder);
        return newOrder;
    }

    @Override
    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id)
                return order;
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        return orders.removeIf(l -> l.getId() == id);
    }

    @Override
    public boolean update(int id, Order order) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                Order updatedOrder = new Order(
                    id,
                    order.getCustomerId(),
                    order.getDate(),
                    order.getShippingAddress(),
                    order.getTotalPrice()
                );
                orders.set(i, updatedOrder);
                return true;
            }
        }
        return false;
    }
}

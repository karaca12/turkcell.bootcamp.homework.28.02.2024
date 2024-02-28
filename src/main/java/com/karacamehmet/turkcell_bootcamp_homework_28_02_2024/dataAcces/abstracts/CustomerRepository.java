package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.dataAcces.abstracts;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAll();
    void add(Customer customer);
    Customer getById(int id);
    void deleteById(int id);
    void update(Customer customer);
}

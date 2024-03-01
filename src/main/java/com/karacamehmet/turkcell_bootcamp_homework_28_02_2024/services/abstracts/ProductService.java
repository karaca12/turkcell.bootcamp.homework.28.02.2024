package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void add(Product product);
    Product getById(int id);
    void deleteById(int id);
    void update(Product product);
}

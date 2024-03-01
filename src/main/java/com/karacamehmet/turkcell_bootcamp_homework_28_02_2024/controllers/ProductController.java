package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Customer;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Product;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @PostMapping
    void add(Product product){
        productService.add(product);
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable int id){
        return productService.getById(id);

    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        productService.deleteById(id);
    }
    @PutMapping
    public void update(@RequestBody Product product){
        productService.update(product);
    }

}

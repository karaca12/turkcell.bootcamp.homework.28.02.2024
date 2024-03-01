package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.CustomerService;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping
    void add(Customer customer) {
        customerService.add(customer);
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable int id) {
        return customerService.getById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        customerService.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody Customer customer) {
        customerService.update(customer);
    }
}

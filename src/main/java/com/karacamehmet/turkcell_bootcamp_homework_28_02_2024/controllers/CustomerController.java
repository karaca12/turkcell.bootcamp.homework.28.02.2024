package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.Service.abstracts.CustomerService;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/getAll")
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @PostMapping
    void add(Customer customer){
        customerService.add(customer);
    }
    @GetMapping("/{id}")
    public Customer getById(@RequestParam int id){
        return customerService.getById(id);

    }
    @DeleteMapping
    public void deleteById(int id){
        customerService.deleteById(id);
    }
    @PutMapping
    public void update(@RequestBody Customer customer){
        customerService.update(customer);
    }
}

package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.CustomerService;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.CustomerRepository;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);

    }

    @Override
    public Customer getById(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);

    }

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }
}

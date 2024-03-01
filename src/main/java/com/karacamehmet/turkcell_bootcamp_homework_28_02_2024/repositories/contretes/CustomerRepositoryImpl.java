package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.contretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.CustomerRepository;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customers;

    public CustomerRepositoryImpl() {
        customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Bilal",19,"Izmir","0536343"));
        customers.add(new Customer(2,"Hilal",21,"Izmir","053621343"));
    }

    @Override
    public List<Customer> getAll() {
        return customers;

    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);

    }

    @Override
    public Customer getById(int id) {
        for (Customer i:customers
             ) {
            if (i.getId()==id){
                return i;
            }

        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        int index=getCustomerIndexById(id);

        if (index!=-1){
            customers.remove(index);

        }

    }

    @Override
    public void update(Customer customer) {
        for (Customer i :customers
        ) {
            if(i.getId()==customer.getId()){
                i.setName(customer.getName());
                i.setAge(customer.getAge());
                i.setAddress(customer.getAddress());
                i.setPhoneNumber(customer.getPhoneNumber());

            }

        }
    }

    public int getCustomerIndexById(int id){
        for (int i=0;i<customers.size();i++){
            if(customers.get(i).getId()==id){
                return i;
            }

        }
        return -1;
    }
}

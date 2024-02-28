package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public Customer(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
}

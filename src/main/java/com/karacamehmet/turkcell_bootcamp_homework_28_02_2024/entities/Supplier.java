package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

import java.util.List;

@Data
public class Supplier {
    private int id;
    private String name;
    private String address;
    private int productId;

    public Supplier(int id, String name, String address, int productId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.productId = productId;
    }
}

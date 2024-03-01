package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private double price;
    private int stockAmount;
    private int categoryId;
}

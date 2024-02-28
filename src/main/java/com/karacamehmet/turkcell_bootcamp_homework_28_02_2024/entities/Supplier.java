package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

import java.util.List;

@Data
public class Supplier {
    private int id;
    private String name;
    private String address;
    private List<Integer> productIds;
}

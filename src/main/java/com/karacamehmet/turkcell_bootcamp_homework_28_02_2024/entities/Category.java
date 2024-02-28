package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities;

import lombok.Data;

import java.util.List;

@Data
public class Category {
    private int id;
    private String name;
    private List<Integer> productIds;
}

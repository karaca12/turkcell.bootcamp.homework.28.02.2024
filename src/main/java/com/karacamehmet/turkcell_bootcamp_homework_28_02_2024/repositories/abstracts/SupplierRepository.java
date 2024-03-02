package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Supplier;

import java.util.List;

public interface SupplierRepository {
    List<Supplier> getAll();
    void add(Supplier supplier);
    Supplier getById(int id);
    void deleteById(int id);
    void update(Supplier supplier);
}

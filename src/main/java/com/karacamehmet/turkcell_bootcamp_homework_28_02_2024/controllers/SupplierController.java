package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.controllers;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Supplier;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/getAll")
    public List<Supplier> getAll() {
        return supplierService.getAll();
    }

    @PostMapping
    void add(Supplier supplier) {
        supplierService.add(supplier);
    }

    @GetMapping("/{id}")
    public Supplier getById(@PathVariable int id) {
        return supplierService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        supplierService.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody Supplier supplier) {
        supplierService.update(supplier);
    }
}

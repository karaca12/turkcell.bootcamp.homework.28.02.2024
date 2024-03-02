package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Supplier;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.SupplierRepository;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.services.abstracts.SupplierService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAll() {
        return supplierRepository.getAll();
    }

    @Override
    public void add(Supplier supplier) {
        supplierRepository.add(supplier);
    }

    @Override
    public Supplier getById(int id) {
        return supplierRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public void update(Supplier supplier) {
        supplierRepository.update(supplier);
    }
}

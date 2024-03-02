package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.contretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Product;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Supplier;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.SupplierRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SupplierRepositoryImpl implements SupplierRepository {
    private List<Supplier> suppliers;

    public SupplierRepositoryImpl() {
        this.suppliers = new ArrayList<>();
        suppliers.add(new Supplier(1,"Mahmut Cabbar","Türkiye,İstanbul/Maltepe",1));
        suppliers.add(new Supplier(2,"Hüsnü Çoban","Türkiye,İstanbul/Şişli",2));
    }

    @Override
    public List<Supplier> getAll() {
        return suppliers;
    }

    @Override
    public void add(Supplier supplier) {
        suppliers.add(supplier);
    }

    @Override
    public Supplier getById(int id) {
        for (Supplier i : suppliers
        ) {
            if (i.getId() == id) {
                return i;
            }

        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        int index = getSupplierIndexById(id);
        if (index != -1) {
            suppliers.remove(index);
        }
    }

    @Override
    public void update(Supplier supplier) {
        for (Supplier i :suppliers
        ) {
            if(i.getId()==supplier.getId()){
                i.setName(supplier.getName());
                i.setAddress(supplier.getAddress());
            }

        }
    }

    public int getSupplierIndexById(int id) {
        for (int i = 0; i < suppliers.size(); i++) {
            if (suppliers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}

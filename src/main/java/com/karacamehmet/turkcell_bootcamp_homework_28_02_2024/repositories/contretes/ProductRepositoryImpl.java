package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.contretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.Product;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products;

    public ProductRepositoryImpl() {
        this.products = new ArrayList<>();
        products.add(new Product(1,"Apple",5.5,200,1));
        products.add(new Product(2,"Laptop",25000,10,2));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product getById(int id) {
        for (Product i:products
        ) {
            if (i.getId()==id){
                return i;
            }

        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        int index=getProductIndexById(id);
        if (index!=-1){
            products.remove(index);
        }
    }

    @Override
    public void update(Product product) {
        for (Product i :products
        ) {
            if(i.getId()==product.getId()){
                i.setName(product.getName());
                i.setPrice(product.getPrice());
                i.setStockAmount(product.getStockAmount());
            }

        }
    }

    public int getProductIndexById(int id){
        for (int i=0;i<products.size();i++){
            if(products.get(i).getId()==id){
                return i;
            }

        }
        return -1;
    }
}

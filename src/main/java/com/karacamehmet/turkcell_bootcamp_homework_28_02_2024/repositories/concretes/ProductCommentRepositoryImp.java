package com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.concretes;

import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.entities.ProductComment;
import com.karacamehmet.turkcell_bootcamp_homework_28_02_2024.repositories.abstracts.ProductCommentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductCommentRepositoryImp implements ProductCommentRepository {
    private List<ProductComment> productComments;

    public ProductCommentRepositoryImp() {
        this.productComments = new ArrayList<>();
        productComments.add(new ProductComment(1, 1, 1, "O kadar uzun süre sonra geldi ki yarısı çürümüş."));
        productComments.add(new ProductComment(2, 2, 2, "Kargo çok hızlıydı, çok iyi paketlenmiş."));
    }

    @Override
    public List<ProductComment> getAll() {
        return productComments;
    }

    @Override
    public void add(ProductComment productComment) {
        productComments.add(productComment);
    }

    @Override
    public ProductComment getById(int id) {
        for (ProductComment i : productComments
        ) {
            if (i.getId() == id) {
                return i;
            }

        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        int index = getProductCommentIndexById(id);
        if (index != -1) {
            productComments.remove(index);
        }
    }

    @Override
    public void update(ProductComment productComment) {
        for (ProductComment i : productComments
        ) {
            if (i.getId() == productComment.getId()) {
                i.setComment(productComment.getComment());
            }

        }
    }

    public int getProductCommentIndexById(int id) {
        for (int i = 0; i < productComments.size(); i++) {
            if (productComments.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}

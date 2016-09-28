package com.lp.test;

import org.springframework.stereotype.Component;

/**
 * Created by 123 on 2016/9/28.
 */
@Component
public class ProductDao {

    public Product getProductFromDb(int id) {
        System.out.println("try to get product from db, id="+id);
        throw new UnsupportedOperationException("there is no db");
    }

    public Product loadProductFromDb(int id) {
        Product p = new Product();
        p.setId(id);
        p.setPrice(id * 4);
        return p;
    }
}

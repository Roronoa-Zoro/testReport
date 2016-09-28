package com.lp.test;

/**
 * Created by 123 on 2016/9/28.
 */
public class ProductService {

    public Product getProduct(int id) {
        Product p = new Product();
        p.setId(id);
        p.setPrice(id * 5);
        return p;
    }

    public Product updateProduct(int id) {
        Product p = getProduct(id);
        p.setPrice(id * 3);
        return p;
    }
}

package com.lp.test;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 123 on 2016/9/28.
 */
@Service
public class ProductService {

    @Resource
    private ProductDao pd;

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

    public Product getProductFromDb(int id) {
        return pd.getProductFromDb(id);
    }

    public Product loadProductFromDb(int id) {
        return pd.loadProductFromDb(id);
    }
}

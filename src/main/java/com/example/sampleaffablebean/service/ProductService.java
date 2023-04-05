package com.example.sampleaffablebean.service;

import com.example.sampleaffablebean.dao.ProductDao;
import com.example.sampleaffablebean.ds.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> listProducts(int categoryId){
        return productDao.findProductByCategoryId(categoryId);
    }





}

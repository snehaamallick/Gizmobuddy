package com.myorg.gizmobuddy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myorg.gizmobuddy.dao.ProductDao;
import com.myorg.gizmobuddy.model.Product;
import com.myorg.gizmobuddy.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    public Product getProductById(int productId){
        return productDao.getProductById(productId);
    }

    public List<Product> getProductList(){
        return productDao.getProductList();
    }

    public void addProduct(Product product){
        productDao.addProduct(product);
    }

    public void editProduct(Product product){
        productDao.editProduct(product);
    }

    public void deleteProduct(Product product){
        productDao.deleteProduct(product);
    }


} // The End of Class;

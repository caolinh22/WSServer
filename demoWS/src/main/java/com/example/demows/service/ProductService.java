package com.example.demows.service;

import com.example.demows.entity.Product;
import com.example.demows.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component(value = "productService")
@WebService
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @WebMethod
    public boolean save(Product product){
        productRepository.save(product);
        return true;
    }

    @WebMethod
    public List<Product> productList(){
        return productRepository.findAll();
    }
}

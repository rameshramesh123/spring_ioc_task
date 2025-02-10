package com.example.springIOC_Beans_IOC.Service;

import com.example.springIOC_Beans_IOC.Entity.Product;
import com.example.springIOC_Beans_IOC.Repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Save Product
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}


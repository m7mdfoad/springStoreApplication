package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.UserNotFoundException;
import com.m7md.erpSystem.models.Product;
import com.m7md.erpSystem.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        super();
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product) {
        product.setProductCode(UUID.randomUUID().toString());
        return productRepo.save(product);
    }

    public List<Product> findProduct() {
        return productRepo.findAll();
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepo.deleteById(productId);
    }

    public Product findProductById(Long id) {
        return productRepo.findProductById(id).orElseThrow(() -> new UserNotFoundException("user with id: " + id + " was not found"));
    }
}

package com.apes.productservice.service;

import com.apes.productservice.dto.ProductRequest;
import com.apes.productservice.dto.ProductResponse;
import com.apes.productservice.model.Product;
import com.apes.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductService {

    private final ProductRepository repository;


    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public String createProduct(ProductRequest request) {
        Product product = repository.save(new Product(request.name(),request.description(),request.price()));
        return "Product " + product.getId() + " is saved";
    }

    public List<ProductResponse> getAllProducts() {
        return repository.findAll()
                .stream()
                .map(ProductResponse::convert)
                .collect(Collectors.toList());
    }
}

package org.suehay.microservicesproducts.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.suehay.microservicesproducts.model.request.ProductRequest;
import org.suehay.microservicesproducts.model.response.ProductResponse;
import org.suehay.microservicesproducts.repositories.ProductRepository;
import org.suehay.microservicesproducts.services.ProductService;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public ProductResponse create(ProductRequest product) {
        return ProductResponse.fromEntity(this.productRepository.save(product.toEntity()));
    }
}
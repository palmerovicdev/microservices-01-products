package org.suehay.microservicesproducts.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.suehay.microservicesproducts.model.request.ProductRequest;
import org.suehay.microservicesproducts.model.response.ProductResponse;
import org.suehay.microservicesproducts.repositories.ProductRepository;
import org.suehay.microservicesproducts.services.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductResponse create(ProductRequest product) {
        log.info("Creating product: {}", product);
        return ProductResponse.fromEntity(this.productRepository.save(product.toEntity()));
    }

    @Override
    public ProductResponse update(Long id, ProductRequest product) {
        log.info("Updating product with id {}: {}", id, product);
        var productEntity=productRepository.findById(id).orElseThrow();
        productEntity.setName(product.getName());
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        productEntity.setSku(product.getSku());
        productEntity.setStatus(product.getStatus());
        return ProductResponse.fromEntity(this.productRepository.save(productEntity));
    }

    @Override
    public ProductResponse findById(Long id) {
        log.info("Finding product with id {}", id);
        return ProductResponse.fromEntity(this.productRepository.findById(id).orElseThrow());
    }

    @Override
    public void delete(Long id) {
        log.info("Deleting product with id {}", id);
        this.productRepository.deleteById(id);
    }

    @Override
    public List<ProductResponse> findAll() {
        log.info("Finding all products");
        return this.productRepository.findAll().stream().map(ProductResponse::fromEntity).toList();
    }
}
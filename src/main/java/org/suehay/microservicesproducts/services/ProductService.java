package org.suehay.microservicesproducts.services;

import org.suehay.microservicesproducts.model.request.ProductRequest;
import org.suehay.microservicesproducts.model.response.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse create(ProductRequest product);
    ProductResponse update(Long id, ProductRequest product);
    ProductResponse findById(Long id);
    void delete(Long id);
    List<ProductResponse> findAll();
}
package org.suehay.microservicesproducts.services;

import org.suehay.microservicesproducts.model.request.ProductRequest;
import org.suehay.microservicesproducts.model.response.ProductResponse;

public interface ProductService {

    ProductResponse create(ProductRequest product);
}
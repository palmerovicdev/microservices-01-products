package org.suehay.microservicesproducts.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.suehay.microservicesproducts.model.request.ProductRequest;
import org.suehay.microservicesproducts.model.response.ProductResponse;
import org.suehay.microservicesproducts.services.ProductService;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest product) {
        return ResponseEntity.ok(this.productService.create(product));
    }
}
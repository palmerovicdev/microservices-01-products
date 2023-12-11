package org.suehay.microservicesproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.suehay.microservicesproducts.model.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
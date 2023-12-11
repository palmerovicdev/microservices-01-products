package org.suehay.microservicesproducts.model.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.suehay.microservicesproducts.model.entities.ProductEntity;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@JsonSerialize
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String sku;
    private Boolean status;

    public static ProductResponse fromEntity(ProductEntity productEntity) {
        return ProductResponse.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .price(productEntity.getPrice())
                .sku(productEntity.getSku())
                .status(productEntity.getStatus())
                .build();
    }
}
package org.suehay.microservicesproducts.model.request;

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
public class ProductRequest implements Serializable {
    private String name;
    private String description;
    private Double price;
    private String sku;
    private Boolean status;

    public ProductEntity toEntity() {
        return ProductEntity.builder()
                            .name(this.name)
                            .description(this.description)
                            .price(this.price)
                            .sku(this.sku)
                            .status(this.status)
                            .build();
    }
}
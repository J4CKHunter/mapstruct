package com.erdemnayin.modelmapper.dto;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class CreateProductRequest {
    private String productName;
    private String colour;
    private Long price;
    private SupplierDto supplier;
}

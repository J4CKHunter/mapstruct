package com.erdemnayin.modelmapper.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductResponseDto {

    private String name;
    private String serialNumber;
    private String color;
    private String price;
    private Date createdAtDate;
    private String createdAtString;
    private SupplierDto supplier;

}
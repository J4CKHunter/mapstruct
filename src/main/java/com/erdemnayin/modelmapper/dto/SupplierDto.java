package com.erdemnayin.modelmapper.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class SupplierDto {
    private String name;
    private String address;
}

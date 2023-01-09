package com.erdemnayin.modelmapper.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Supplier extends BaseEntity{
    private String name;
    private String address;

    @Override
    public String toString() {
        return "Supplier{" + super.toString() +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

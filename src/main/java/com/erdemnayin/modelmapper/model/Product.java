package com.erdemnayin.modelmapper.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product extends BaseEntity{

    private String name;

//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String serialNumber; // = UUID.randomUUID().toString(); // serialNumber set edilmedi
    private String color;
    private BigDecimal price;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Supplier.class)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", nullable = true)
    private Supplier supplier;

    @Override
    public String toString() {
        return "Product{" + super.toString() +
                "name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", supplier=" + supplier +
                '}';
    }
}

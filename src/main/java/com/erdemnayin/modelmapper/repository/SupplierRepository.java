package com.erdemnayin.modelmapper.repository;

import com.erdemnayin.modelmapper.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}

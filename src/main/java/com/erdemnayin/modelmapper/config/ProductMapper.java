package com.erdemnayin.modelmapper.config;

import com.erdemnayin.modelmapper.dto.CreateProductRequest;
import com.erdemnayin.modelmapper.dto.ProductResponseDto;
import com.erdemnayin.modelmapper.dto.SupplierDto;
import com.erdemnayin.modelmapper.model.Product;
import com.erdemnayin.modelmapper.model.Supplier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "name" , source = "productName")
    @Mapping(target = "color", source = "colour")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "supplier", source = "supplier")
    @Mapping(target = "serialNumber", expression = MappingUtils.GENERATE_UUID_EXPRESSION)
    public Product createProductRequestToProduct(CreateProductRequest createProductRequest);

//    @Mapping(target = "price", source = "price")
    @Mapping(target = "supplier", source = "supplier")
    @Mapping(target = "createdAtDate", source = "createdAt")
    @Mapping(target = "createdAtString", source = "createdAt", dateFormat = "dd-MM-yyyy HH:mm:ss")
    public ProductResponseDto productToProductResponseDto(Product product);

    public Supplier supplierDtoToSupplier(SupplierDto supplierDto);

    public SupplierDto supplierToSupplierDto(Supplier supplier);

}

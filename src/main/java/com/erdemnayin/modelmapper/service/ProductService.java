package com.erdemnayin.modelmapper.service;

import com.erdemnayin.modelmapper.config.ProductMapper;
import com.erdemnayin.modelmapper.dto.CreateProductRequest;
import com.erdemnayin.modelmapper.dto.ProductResponseDto;
import com.erdemnayin.modelmapper.model.Product;
import com.erdemnayin.modelmapper.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
//import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class ProductService {

    private final ProductRepository productRepository;
//    private final ModelMapper modelMapper;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResponseDto> getAllProducts(){
//        return productRepository.findAll().stream()
//                .map(product -> modelMapper.map(product, ProductResponseDto.class))
//                .collect(Collectors.toList());

        return productRepository.findAll().stream()
                .map(ProductMapper.PRODUCT_MAPPER::productToProductResponseDto)
                .collect(Collectors.toList());

    }

    public ProductResponseDto createProduct(CreateProductRequest createProductRequest){
//        Product mappedRequestProduct = modelMapper.map(createProductRequest, Product.class);
//        Product productFromDb = productRepository.save(mappedRequestProduct);
//        log.info("ProductCreated -> " + productFromDb);
//        return modelMapper.map(productFromDb, ProductResponseDto.class);

        Product mappedRequestProduct = ProductMapper.PRODUCT_MAPPER.createProductRequestToProduct(createProductRequest);
        Product productFromDb = productRepository.save(mappedRequestProduct);
        log.info("ProductCreated -> " + productFromDb);
        return ProductMapper.PRODUCT_MAPPER.productToProductResponseDto(productFromDb);
    }
}

package com.erdemnayin.modelmapper;

import com.erdemnayin.modelmapper.dto.CreateProductRequest;
import com.erdemnayin.modelmapper.dto.ProductResponseDto;
import com.erdemnayin.modelmapper.dto.SupplierDto;
import com.erdemnayin.modelmapper.model.Product;
import com.erdemnayin.modelmapper.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ModelmapperApplication implements CommandLineRunner {

	private final ProductService productService;

	public ModelmapperApplication(ProductService productService) {
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ModelmapperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		final CreateProductRequest product1 = CreateProductRequest
				.builder()
				.productName("Ps5")
				.colour("white")
				.price(20000L)
				.supplier(SupplierDto
						.builder()
						.name("Sony")
						.address("Japan")
						.build())
				.build();

		final CreateProductRequest product2 = CreateProductRequest
				.builder()
				.productName("xbox series x")
				.colour("black")
				.price(18000L)
				.supplier(SupplierDto
						.builder()
						.name("Microsoft")
						.address("USA")
						.build())
				.build();

		productService.createProduct(product1);
		productService.createProduct(product2);

	}
}

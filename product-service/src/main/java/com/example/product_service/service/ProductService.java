package com.example.product_service.service;

import com.example.product_service.dto.ProductRequest;
import com.example.product_service.dto.ProductResponse;
import com.example.product_service.model.Product;
import com.example.product_service.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    public final IProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = this.getProduct(productRequest);
        Product savedProduct = productRepository.save(product);
        log.info("Product created successfully", savedProduct.getSkuCode());
        return this.getProductResponse(product);
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::getProductResponse).toList();
    }

    private ProductResponse getProductResponse(Product product) {
        return ProductResponse.builder()
                .productId(product.getProductId())
                .name(product.getName())
                .desc(product.getDesc())
                .skuCode(product.getSkuCode())
                .price(product.getPrice())
                .build();
    }
    private Product getProduct(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.name())
                .desc(productRequest.desc())
                .skuCode(productRequest.skuCode())
                .price(productRequest.price())
                .build();
    }
}

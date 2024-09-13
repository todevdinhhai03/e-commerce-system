package com.example.product_service.dto;

import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record ProductResponse(String productId, String name, String desc, String skuCode, BigDecimal price) {
}

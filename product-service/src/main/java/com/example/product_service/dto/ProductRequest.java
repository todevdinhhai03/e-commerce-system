package com.example.product_service.dto;

import java.math.BigDecimal;

public record ProductRequest(String name, String desc, String skuCode, BigDecimal price) {
}

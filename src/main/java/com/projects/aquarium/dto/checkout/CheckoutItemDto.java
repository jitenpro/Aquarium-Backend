package com.projects.aquarium.dto.checkout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class CheckoutItemDto {
    private String productName;
    private int  quantity;
    private double price;
    private long productId;
    private int userId;
}

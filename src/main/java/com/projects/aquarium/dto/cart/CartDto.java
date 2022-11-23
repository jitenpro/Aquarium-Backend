package com.projects.aquarium.dto.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class CartDto {
    private List<CartItemDto> cartItems;
    private double totalCost;
}

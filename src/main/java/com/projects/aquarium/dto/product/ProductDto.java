package com.projects.aquarium.dto.product;

import com.projects.aquarium.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.xml.bind.DatatypeConverter.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class ProductDto {
    private Integer id;
    private @NotNull String name;
    private @NotNull String imageURL;
    private @NotNull Double price;
    private @NotNull String description;
    private @NotNull Integer categoryId;

    public ProductDto(Product product) {
        this.setId(product.getId());
        this.setName(product.getName());
        this.setImageURL(product.getImageURL());
        this.setDescription(product.getDescription());
        this.setPrice(product.getPrice());
        this.setCategoryId(product.getCategory().getId());
    }

    public ProductDto(@NotNull String name, @NotNull String imageURL, @NotNull Double price, @NotNull String description, @NotNull Integer categoryId) {
        this.name = name;
        this.imageURL = imageURL;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
    }
}

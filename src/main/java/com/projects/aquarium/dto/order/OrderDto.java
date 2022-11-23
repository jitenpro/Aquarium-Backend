package com.projects.aquarium.dto.order;

import com.projects.aquarium.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class OrderDto {
    private Integer id;
    private @NotNull Integer userId;

    public OrderDto(Order order) {
        this.setId(order.getId());
        //this.setUserId(order.getUserId());
    }
}

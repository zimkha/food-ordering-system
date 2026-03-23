package com.food.ordering.system.order.service.domain.mapper;


import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.entity.Product;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.valueobject.ProductId;
import com.food.ordering.system.order.service.domain.valueobject.RestaurantId;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class OrderDataMapper {

    private Restaurant createOrderCommandToRestaurant(CreateOrderCommand createOrderCommand) {
        return Restaurant.builder()
                .restaurantId(new RestaurantId(createOrderCommand.restaurantId()))
                .products(createOrderCommand.items.stream().map(orderItem ->
                    new Product(new ProductId(orderItem.productId())))
                        .collect(Collectors.toList()))
                .build();
    }
}

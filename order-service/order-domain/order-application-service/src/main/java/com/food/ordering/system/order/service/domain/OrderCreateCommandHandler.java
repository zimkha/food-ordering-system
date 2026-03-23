package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import org.springframework.stereotype.Component;


@Component
public class OrderCreateCommandHandler {
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        return null;
    }
}

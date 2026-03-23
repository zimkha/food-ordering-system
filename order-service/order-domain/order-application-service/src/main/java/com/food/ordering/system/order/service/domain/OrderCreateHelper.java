package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.mapper.OrderDataMapper;
import com.food.ordering.system.order.service.domain.ports.output.repository.CustomerRepository;
import com.food.ordering.system.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.system.order.service.domain.ports.output.repository.RestaurantRepository;
import manifold.ext.props.rt.api.var;
import org.springframework.stereotype.Component;


@Component
public class OrderCreateHelper {

    final @var OrderDomainService  orderDomainService;
    final @var OrderRepository orderRepository;

     final @var CustomerRepository customerRepository;

     final @var RestaurantRepository restaurantRepository;

     final @var OrderDataMapper orderDataMapper;
}

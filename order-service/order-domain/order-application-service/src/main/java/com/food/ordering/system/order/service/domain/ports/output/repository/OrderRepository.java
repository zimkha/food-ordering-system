package com.food.ordering.system.order.service.domain.ports.output.repository;



import com.food.ordering.system.order.service.domain.Order;
import com.food.ordering.system.order.service.domain.valueobject.TrackingId;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);

    Optional<List<Order>> getOrders();
}

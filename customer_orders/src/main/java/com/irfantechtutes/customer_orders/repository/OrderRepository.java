package com.irfantechtutes.customer_orders.repository;

import com.irfantechtutes.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author irfan
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}

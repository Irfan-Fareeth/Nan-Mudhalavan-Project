package com.irfantechtutes.customer_orders.repository;

import com.irfantechtutes.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author irfan
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

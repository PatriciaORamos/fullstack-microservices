package com.fullstack.order.repository;

import com.fullstack.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface OrderRepository extends JpaRepository<Order, UUID> {
	
  List<Order> findByCustomerId(UUID customerId);
  
}

package com.fullstack.order.dto;

import jakarta.validation.constraints.*;
import java.util.*;

public class OrderRequest {
	
  @NotNull 
  private UUID customerId;
  
  @NotEmpty 
  private List<OrderItemRequest> items;

  public UUID getCustomerId() { return customerId; }
  public void setCustomerId(UUID customerId) { this.customerId = customerId; }
  public List<OrderItemRequest> getItems() { return items; }
  public void setItems(List<OrderItemRequest> items) { this.items = items; }
  
}

package com.fullstack.order.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;

public class OrderResponse {
	
  private UUID id;
  private UUID customerId;
  private String status;
  private BigDecimal total;
  private OffsetDateTime createdAt;
  private List<OrderItemResponse> items;

  public OrderResponse() {}
  
  public OrderResponse(UUID id, UUID customerId, String status, BigDecimal total,
                       OffsetDateTime createdAt, List<OrderItemResponse> items) {
    this.id = id; this.customerId = customerId; this.status = status; this.total = total;
    this.createdAt = createdAt; this.items = items;
  }

  public UUID getId() { return id; }
  public void setId(UUID id) { this.id = id; }
  public UUID getCustomerId() { return customerId; }
  public void setCustomerId(UUID customerId) { this.customerId = customerId; }
  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }
  public BigDecimal getTotal() { return total; }
  public void setTotal(BigDecimal total) { this.total = total; }
  public OffsetDateTime getCreatedAt() { return createdAt; }
  public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
  public List<OrderItemResponse> getItems() { return items; }
  public void setItems(List<OrderItemResponse> items) { this.items = items; }
  
}

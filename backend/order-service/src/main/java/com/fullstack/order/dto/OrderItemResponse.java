package com.fullstack.order.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderItemResponse {
	
  private UUID id;
  private UUID productId;
  private int qty;
  private BigDecimal unitPrice;

  public OrderItemResponse() {}
  
  public OrderItemResponse(UUID id, UUID productId, int qty, BigDecimal unitPrice) {
    this.id = id; this.productId = productId; this.qty = qty; this.unitPrice = unitPrice;
  }

  public UUID getId() { return id; }
  public void setId(UUID id) { this.id = id; }
  public UUID getProductId() { return productId; }
  public void setProductId(UUID productId) { this.productId = productId; }
  public int getQty() { return qty; }
  public void setQty(int qty) { this.qty = qty; }
  public BigDecimal getUnitPrice() { return unitPrice; }
  public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }
  
}

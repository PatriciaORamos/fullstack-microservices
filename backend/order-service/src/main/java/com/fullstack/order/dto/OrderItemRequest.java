package com.fullstack.order.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.UUID;

public class OrderItemRequest {
	
  @NotNull 
  private UUID productId;
  
  @Min(1)  
  private int qty;
  
  @NotNull @DecimalMin("0.00") 
  private BigDecimal unitPrice;

  public UUID getProductId() { return productId; }
  public void setProductId(UUID productId) { this.productId = productId; }
  public int getQty() { return qty; }
  public void setQty(int qty) { this.qty = qty; }
  public BigDecimal getUnitPrice() { return unitPrice; }
  public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }
  
}

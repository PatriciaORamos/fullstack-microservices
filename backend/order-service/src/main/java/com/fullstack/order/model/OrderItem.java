package com.fullstack.order.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItem {

  @Id
  @Column(columnDefinition = "uuid")
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "order_id", nullable = false, columnDefinition = "uuid")
  private Order order;

  @Column(name = "product_id", nullable = false, columnDefinition = "uuid")
  private UUID productId;

  @Column(nullable = false)
  private int qty;

  @Column(name = "unit_price", nullable = false, precision = 12, scale = 2)
  private BigDecimal unitPrice;

  public UUID getId() { return id; }
  public void setId(UUID id) { this.id = id; }

  public Order getOrder() { return order; }
  public void setOrder(Order order) { this.order = order; }

  public UUID getProductId() { return productId; }
  public void setProductId(UUID productId) { this.productId = productId; }

  public int getQty() { return qty; }
  public void setQty(int qty) { this.qty = qty; }

  public BigDecimal getUnitPrice() { return unitPrice; }
  public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }
}

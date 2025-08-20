package com.fullstack.order.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @Column(columnDefinition = "uuid")
  private UUID id;

  @Column(name = "customer_id", nullable = false, columnDefinition = "uuid")
  private UUID customerId;

  @Column(nullable = false)
  private String status;

  @Column(nullable = false, precision = 12, scale = 2)
  private BigDecimal total;

  @Column(name = "created_at", nullable = false)
  private OffsetDateTime createdAt;

  @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
  private List<OrderItem> items = new ArrayList<>();

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

  public List<OrderItem> getItems() { return items; }
  public void setItems(List<OrderItem> items) { this.items = items; }

  public void addItem(OrderItem item) {
    this.items.add(item);
    item.setOrder(this);
  }
}
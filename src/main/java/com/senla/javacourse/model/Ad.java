package com.senla.javacourse.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Ad {
  
  private Long id;
  private String title;
  private BigDecimal price;
  private String description;
  
  public Ad() {
  
  }
  
  public Ad(Long id, String title, BigDecimal price, String description) {
    this.id = id;
    this.title = title;
    this.price = price;
    this.description = description;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public BigDecimal getPrice() {
    return price;
  }
  
  public void setPrice(BigDecimal price) {
    this.price = price;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Ad ad = (Ad) o;
    return Objects.equals(getTitle(), ad.getTitle()) && Objects.equals(getPrice(), ad.getPrice())
      && Objects.equals(getDescription(), ad.getDescription());
  }
  
  @Override public int hashCode() {
    return Objects.hash(getTitle(), getPrice(), getDescription());
  }
}

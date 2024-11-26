package com.senla.javacourse.dto;

import java.util.Objects;

public class AdDto {
  private String title;
  private String price;
  private String description;
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getPrice() {
    return price;
  }
  
  public void setPrice(String price) {
    this.price = price;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    AdDto adDto = (AdDto) o;
    return Objects.equals(getTitle(), adDto.getTitle()) && Objects.equals(getPrice(),
      adDto.getPrice()) && Objects.equals(getDescription(), adDto.getDescription());
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(getTitle(), getPrice(), getDescription());
  }
}

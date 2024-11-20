package com.senla.javacourse.repository;

import com.senla.javacourse.model.Ad;

public interface AdRepository {
  
  Ad getById(Long id);
  
  void save(Ad ad);
  
}

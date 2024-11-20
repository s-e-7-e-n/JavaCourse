package com.senla.javacourse.service;

import com.senla.javacourse.dto.AdDto;

public interface AdService {
  
  AdDto getAd(Long id);
  
  void save(AdDto adDto);
  
}

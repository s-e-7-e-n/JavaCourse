package com.senla.javacourse.service.impl;

import com.senla.javacourse.dto.AdDto;
import com.senla.javacourse.mapper.AdMapper;
import com.senla.javacourse.mapper.impl.AdMapperImpl;
import com.senla.javacourse.repository.AdRepository;
import com.senla.javacourse.repository.impl.AdRepositoryImpl;
import com.senla.javacourse.service.AdService;

public class AdServiceImpl implements AdService {
  
  private final AdRepository adRepository;
  private final AdMapper adMapper;
  
  public AdServiceImpl(AdRepository adRepository, AdMapper adMapper) {
    this.adRepository = adRepository;
    this.adMapper = adMapper;
  }
  
  @Override
  public AdDto getAd(Long id) {
    return adMapper.map(adRepository.getById(id));
  }
  
  @Override
  public void save(AdDto adDto) {
    adRepository.save(adMapper.map(adDto));
  }
}

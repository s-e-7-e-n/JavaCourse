package com.senla.javacourse.controller.impl;

import com.senla.javacourse.controller.AdController;
import com.senla.javacourse.dto.AdDto;
import com.senla.javacourse.service.AdService;

public class AdControllerImpl implements AdController {
  
  private final AdService adService;
  
  public AdControllerImpl(AdService adService) {
    this.adService = adService;
  }
  
  @Override public void createAd(AdDto adDto) {
    adService.save(adDto);
  }
}

package com.senla.javacourse.repository.impl;

import com.senla.javacourse.model.Ad;
import com.senla.javacourse.repository.AdRepository;
import java.util.Map;

public class AdRepositoryImpl implements AdRepository {
  
  private final Map<Long, Ad> ads;
  
  public AdRepositoryImpl(Map<Long, Ad> ads) {
    this.ads = ads;
  }
  
  @Override
  public Ad getById(Long id) {
    return ads.get(id);
  }
  
  @Override
  public synchronized void save(Ad ad) {
    if (ad.getId() == null) {
      Long lastIndex = ads.keySet().stream().max(Long::compareTo).orElse(0L);
      ad.setId(lastIndex + 1);
    }
    ads.put(ad.getId(), ad);
  }
}

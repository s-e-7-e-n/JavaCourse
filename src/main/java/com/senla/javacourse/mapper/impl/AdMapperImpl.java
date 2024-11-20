package com.senla.javacourse.mapper.impl;

import com.senla.javacourse.dto.AdDto;
import com.senla.javacourse.mapper.AdMapper;
import com.senla.javacourse.model.Ad;
import java.math.BigDecimal;

public class AdMapperImpl implements AdMapper {
  
  @Override
  public AdDto map(Ad source) {
    if (source == null) {
      return null;
    }
    AdDto adDto = new AdDto();
    adDto.setTitle(source.getTitle());
    adDto.setPrice(source.getPrice().toPlainString());
    adDto.setDescription(source.getDescription());
    return adDto;
  }
  
  @Override
  public Ad map(AdDto source) {
    if (source == null) {
      return null;
    }
    Ad ad = new Ad();
    ad.setTitle(source.getTitle());
    ad.setPrice(new BigDecimal(source.getPrice()));
    ad.setDescription(source.getDescription());
    return ad;
  }
}

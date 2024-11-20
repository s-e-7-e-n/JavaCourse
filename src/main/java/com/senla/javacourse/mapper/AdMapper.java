package com.senla.javacourse.mapper;

import com.senla.javacourse.dto.AdDto;
import com.senla.javacourse.model.Ad;

public interface AdMapper {
  
  AdDto map(Ad source);
  
  Ad map(AdDto source);
}

package com.senla.javacourse.mapper.impl;

import com.senla.javacourse.dto.AdDto;
import com.senla.javacourse.mapper.AdMapper;
import com.senla.javacourse.mapper.impl.AdMapperImpl;
import com.senla.javacourse.model.Ad;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("AdMapperImpl тест")
class AdMapperImplTest {
  
  private AdMapper adMapper;
  
  @BeforeEach
  void setUp() {
    adMapper = new AdMapperImpl();
  }
  
  @Test
  @DisplayName("Ad должен смапиться в AdDto")
  void shouldMapAdToAdDto() {
    // given
    Ad source = new Ad();
    source.setId(1L);
    source.setTitle("TestTitle");
    source.setPrice(BigDecimal.valueOf(1.53));
    source.setDescription("TestDescription");
    
    // when
    AdDto actual = adMapper.map(source);
    
    // then
    AdDto expected = new AdDto();
    expected.setTitle("TestTitle");
    expected.setPrice("1.53");
    expected.setDescription("TestDescription");
    Assertions.assertEquals(expected, actual);
  }
  
  @Test
  @DisplayName("AdDto должен смапиться в Ad")
  void shouldMapAdDtoToAd() {
    // given
    AdDto dto = new AdDto();
    dto.setTitle("TestTitle");
    dto.setPrice("1.53");
    dto.setDescription("TestDescription");
    
    // when
    Ad actual = adMapper.map(dto);
    
    // then
    Ad expected = new Ad();
    expected.setTitle("TestTitle");
    expected.setPrice(BigDecimal.valueOf(1.53));
    expected.setDescription("TestDescription");
    Assertions.assertEquals(expected, actual);
  }
}
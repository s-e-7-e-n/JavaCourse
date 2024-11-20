package com.senla.javacourse.repository.impl;

import com.senla.javacourse.model.Ad;
import com.senla.javacourse.repository.AdRepository;
import com.senla.javacourse.repository.impl.AdRepositoryImpl;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("AdRepositoryImpl тест")
class AdRepositoryImplTest {
  
  private Map<Long, Ad> adMapMock;
  private AdRepository adRepository;
  
  @BeforeEach
  void setUp() {
    adMapMock = new HashMap<>();
    adRepository = new AdRepositoryImpl(adMapMock);
  }
  
  @Test
  @DisplayName("Должен вернуть Ad")
  void shouldReturnAd() {
    // given
    Ad expected = new Ad();
    expected.setId(1L);
    expected.setTitle("TestTitle");
    expected.setPrice(BigDecimal.valueOf(1.53));
    expected.setDescription("TestDescription");
    adMapMock.put(1L, expected);
    
    // when
    Ad actual = adRepository.getById(1L);
    
    // then
    Assertions.assertEquals(expected, actual);
  }
  
  @Test
  @DisplayName("Должен сохранить Ad и добавить id")
  void shouldSave() {
    // given
    Ad ad = new Ad();
    ad.setTitle("TestTitle");
    ad.setPrice(BigDecimal.valueOf(1.53));
    ad.setDescription("TestDescription");
    
    // when
    adRepository.save(ad);
    
    // then
    Assertions.assertEquals(1L, ad.getId());
  }
}
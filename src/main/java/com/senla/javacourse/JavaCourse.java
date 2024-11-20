package com.senla.javacourse;

import com.senla.javacourse.controller.AdController;
import com.senla.javacourse.controller.impl.AdControllerImpl;
import com.senla.javacourse.mapper.AdMapper;
import com.senla.javacourse.mapper.impl.AdMapperImpl;
import com.senla.javacourse.model.Ad;
import com.senla.javacourse.repository.AdRepository;
import com.senla.javacourse.repository.impl.AdRepositoryImpl;
import com.senla.javacourse.service.AdService;
import com.senla.javacourse.service.impl.AdServiceImpl;
import java.util.HashMap;
import java.util.Map;

public class JavaCourse {
    public static void main(String[] args) {
        Map<Long, Ad> adMap = new HashMap<>();
        
        AdRepository adRepository = new AdRepositoryImpl(adMap);
        AdMapper adMapper = new AdMapperImpl();
        AdService adService = new AdServiceImpl(adRepository, adMapper);
        AdController adController = new AdControllerImpl(adService);
    }
}

package com.gooks.blacklabel.api.domain.sample.service;

import com.gooks.blacklabel.api.domain.sample.dto.SampleDto;

public interface SampleService {
    SampleDto.Response getSampleData(String param);
    
    int deleteSampleData(String param);
}

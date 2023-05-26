package com.gooks.blacklabel.api.domain.device.service;

import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;


public interface DeviceService {
    DeviceDto.Response getSampleData(String param);
    
    int deleteSampleData(String param);
}

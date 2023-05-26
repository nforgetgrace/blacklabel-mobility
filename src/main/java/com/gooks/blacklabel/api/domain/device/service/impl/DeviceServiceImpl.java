package com.gooks.blacklabel.api.domain.device.service.impl;


import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;
import com.gooks.blacklabel.api.domain.device.service.DeviceService;
import com.gooks.blacklabel.api.domain.device.service.mapper.DeviceMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final DeviceMapper mapper;

    @Override
    public DeviceDto.Response getSampleData(String param) {
        log.info("필요한 로그는 이렇게 log.level(info, error ...ETC) 을 보면서 찍으면 됩니다."); 
        log.info(" 123123 {} ", mapper.getSampleData(param));
        return mapper.getSampleData(param);
    }
    
    @Override
    public int deleteSampleData(String param) {
    	int rst = mapper.deleteSampleData(param);
    	return rst;
    }
}

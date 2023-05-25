package com.gooks.blacklabel.api.domain.sample.service.impl;


import com.gooks.blacklabel.api.domain.sample.dto.SampleDto;
import com.gooks.blacklabel.api.domain.sample.service.SampleService;
import com.gooks.blacklabel.api.domain.sample.service.mapper.SampleMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    private final SampleMapper mapper;

    @Override
    public SampleDto.Response getSampleData(String param) {
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

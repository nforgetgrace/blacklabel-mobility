package com.gooks.blacklabel.api.domain.sample.service.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gooks.blacklabel.api.domain.sample.dto.SampleDto;

@Mapper
public interface SampleMapper {    

    SampleDto.Response getSampleData(String param);
    int deleteSampleData(String param);
}

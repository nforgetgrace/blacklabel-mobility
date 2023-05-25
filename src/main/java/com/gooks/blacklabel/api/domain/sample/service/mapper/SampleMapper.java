package com.gooks.blacklabel.api.domain.sample.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gooks.blacklabel.api.domain.sample.dto.SampleDto;

@Mapper
public interface SampleMapper {    

    SampleDto getSampleData(String fd_sample);

}

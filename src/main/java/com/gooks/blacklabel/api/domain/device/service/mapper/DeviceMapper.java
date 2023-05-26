package com.gooks.blacklabel.api.domain.device.service.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;

@Mapper
public interface DeviceMapper {    

	DeviceDto.Response getSampleData(String param);
    int deleteSampleData(String param);
}

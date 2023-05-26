package com.gooks.blacklabel.api.domain.device.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;

@Mapper
public interface DeviceMapper {    
	List<DeviceDto.Response>getDeviceList();
	DeviceDto.Response getDevice(int request);
	int registDevice(DeviceDto.Request request);
	int updateDevice(DeviceDto.Request request);
    int deleteDevice(int request);
    
}

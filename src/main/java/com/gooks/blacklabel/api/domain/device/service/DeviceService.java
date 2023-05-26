package com.gooks.blacklabel.api.domain.device.service;

import java.util.List;

import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;


public interface DeviceService {
	List<DeviceDto.Response> getDeviceList();
	DeviceDto.Response getDevice(int request);
    DeviceDto.Response registDevice(DeviceDto.Request request);
    DeviceDto.Response updateDevice(DeviceDto.Request request);
    DeviceDto.Response deleteDevice(int request); 
}

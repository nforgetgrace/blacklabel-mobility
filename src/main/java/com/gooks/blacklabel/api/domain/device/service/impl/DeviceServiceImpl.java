package com.gooks.blacklabel.api.domain.device.service.impl;


import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;
import com.gooks.blacklabel.api.domain.device.service.DeviceService;
import com.gooks.blacklabel.api.domain.device.service.mapper.DeviceMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DeviceServiceImpl implements DeviceService {

    private final DeviceMapper mapper;

    @Override
    public List<DeviceDto.Response> getDeviceList(){
    	return mapper.getDeviceList();
    }
    
    
    @Override
    public DeviceDto.Response getDevice(int request) {       
    	return mapper.getDevice(request);
    }
    
    
    @Override
    public DeviceDto.Response registDevice(DeviceDto.Request request) {
        
        if (mapper.registDevice(request) != 1) {
        	return DeviceDto.Response.builder()
        			.pk_device(-1)
        			.fd_device_serial("")
            		.fd_device_soc("")
            		.fd_device_type("")
            		.fd_device_status("")
        			.build();
        } else {
            return DeviceDto.Response.builder()
            		.pk_device(0)
            		.fd_device_serial(request.getFd_device_serial())
            		.fd_device_soc(request.getFd_device_soc())
            		.fd_device_type(request.getFd_device_type())
            		.fd_device_status(request.getFd_device_status())
            		.build();
        }
    }
    
    @Override
    public DeviceDto.Response updateDevice(DeviceDto.Request request) {
        
        if (mapper.updateDevice(request) != 1) {
        	return DeviceDto.Response.builder()
        			.pk_device(-1)
        			.fd_device_serial("")
            		.fd_device_soc("")
            		.fd_device_type("")
            		.fd_device_status("")
        			.build();
        } else {
            return DeviceDto.Response.builder()
            		.pk_device(0)
            		.fd_device_serial(request.getFd_device_serial())
            		.fd_device_soc(request.getFd_device_soc())
            		.fd_device_type(request.getFd_device_type())
            		.fd_device_status(request.getFd_device_status())
            		.build();
        }
    }
    
    @Override
    public DeviceDto.Response deleteDevice(int request) {
        
    	DeviceDto.Response data = mapper.getDevice(request);

    	int rst = mapper.deleteDevice(request);

    	if (rst != 1) {
        	return DeviceDto.Response.builder()
        			.pk_device(-1)
        			.fd_device_serial(null)
            		.fd_device_soc(null)
            		.fd_device_type(null)
            		.fd_device_status(null)
        			.build();
        } else {
            return DeviceDto.Response.builder()
            		.pk_device(data.getPk_device())
            		.fd_device_serial(data.getFd_device_serial())
            		.fd_device_soc(data.getFd_device_soc())
            		.fd_device_type(data.getFd_device_type())
            		.fd_device_status(data.getFd_device_status())
        			.build();
        }
    }

}

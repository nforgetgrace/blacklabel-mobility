package com.gooks.blacklabel.api.domain.device.controller;

import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;
import com.gooks.blacklabel.api.domain.device.service.DeviceService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.data.rest.core.annotation.Description;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/device")
public class DeviceController {
    private final DeviceService deviceService;

    @GetMapping("/list")
    @Description("장비리스트를 조회한다")
    public List<DeviceDto.Response> getDeviceList() {
        return deviceService.getDeviceList();
    }
    
    
    @GetMapping("/get")
    @Description("모빌리티 장비를 조회합니다.")
    public DeviceDto.Response getDevice(@RequestParam String request) {
    	
        return deviceService.getDevice(Integer.parseInt(request));
    }
    
    @PostMapping("/regist")
    @Description("모빌리티 장비를 등록합니다.")
    public DeviceDto.Response registDevice(@RequestBody DeviceDto.Request request) {
        return deviceService.registDevice(request);
    }
    
    @PutMapping("/update")
    @Description("모빌리티 장비를 정보 업데이트합니다.")
    public DeviceDto.Response updateDevice(@RequestBody DeviceDto.Request request) {
        return deviceService.updateDevice(request);
    }
    
    @DeleteMapping("/delete")
    @Description("모빌리티 장비를 정보 업데이트합니다.")
    public DeviceDto.Response deleteDevice(@RequestParam String request) {
        return deviceService.deleteDevice(Integer.parseInt(request));
    }

}
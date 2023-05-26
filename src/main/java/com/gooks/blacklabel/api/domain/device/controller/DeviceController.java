package com.gooks.blacklabel.api.domain.device.controller;

import com.gooks.blacklabel.api.domain.device.dto.DeviceDto;
import com.gooks.blacklabel.api.domain.device.service.DeviceService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * com.gooks.blacklabel.api.domain.sample.controller
 * </pre>
 * 
 * @설명 원준씨를 위한 샘플코드
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/device")
@Slf4j
public class DeviceController {
    private final DeviceService deviceService;

    @GetMapping("/regist")
    @Description("샘플코드 입니다.")
    public DeviceDto.Response getSampleData(@NonNull @RequestParam String param) {
        log.info("필요한 로그는 여기에....");

        return deviceService.getSampleData(param);

    }
    
    @DeleteMapping("/delete")
    @Description("샘플코드 입니다.")
    public int deleteSampleData(@NonNull @RequestParam String param) {
        return deviceService.deleteSampleData(param);
    }
}
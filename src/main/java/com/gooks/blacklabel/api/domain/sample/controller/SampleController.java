package com.gooks.blacklabel.api.domain.sample.controller;

import com.gooks.blacklabel.api.domain.sample.dto.SampleDto;
import com.gooks.blacklabel.api.domain.sample.service.SampleService;

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
@RequestMapping("/black/api")
@Slf4j
public class SampleController {
    private final SampleService sampleService;

    @GetMapping("/sample")
    @Description("샘플코드 입니다.")
    public SampleDto.Response getSampleData(@NonNull @RequestParam String param) {
        log.info("필요한 로그는 여기에....");

        return sampleService.getSampleData(param);

    }
    
    @DeleteMapping("/delete")
    @Description("샘플코드 입니다.")
    public int deleteSampleData(@NonNull @RequestParam String param) {
        return sampleService.deleteSampleData(param);
    }
}
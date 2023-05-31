package com.gooks.blacklabel.api.domain.using.controller;

import java.util.List;

import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gooks.blacklabel.api.domain.using.dto.UsingDto;
import com.gooks.blacklabel.api.domain.using.service.UsingService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/using")
public class UsingController {
	private final UsingService usingService;
	
	@GetMapping("/list")
	@Description("이용 내역을 조회합니다.")
	public List<UsingDto.Response> getUsingList(){
		return usingService.getUsingList();
	}
	
	@GetMapping("/get")
	@Description("특정 이용 조회합니다.")
	public UsingDto.Response getUsing(@RequestParam String request){
		return usingService.getUsing(Integer.parseInt(request));
	}
	
	@PostMapping("/use")
	@Description("대여 시작.")
	public UsingDto.Response useUsing(@RequestBody UsingDto.Request request){
		return usingService.useUsing(request);
	}
	
	@PutMapping("/return")
	@Description("반납 완료.")
	public UsingDto.Response returnUsing(@RequestBody UsingDto.Request request){
		return usingService.returnUsing(request);
	}
	
	
	// routeUsing //
	
}

package com.gooks.blacklabel.api.domain.using.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gooks.blacklabel.api.domain.using.dto.UsingDto;
import com.gooks.blacklabel.api.domain.using.service.UsingService;
import com.gooks.blacklabel.api.domain.using.service.mapper.UsingMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsingServiceImpl implements UsingService{

	private final UsingMapper mapper;

	@Override
	public List<UsingDto.Response> getUsingList() {
		return mapper.getUsingList();
	}

	@Override
	public UsingDto.Response getUsing(int request) {
		return mapper.getUsing(request);
	}

	@Override
	public UsingDto.Response useUsing(UsingDto.Request request) {
		
		if (mapper.useUsing(request) != 1){
			return UsingDto.Response.builder()
					.pk_using(-1)
					.fk_member("")
					.fk_device("")
					.fd_using_date_start("")
					.fd_using_date_end("")
					.fd_using_total_min("")
					.fd_using_total_price("")
					.build();
		} else {
			return UsingDto.Response.builder()
					.pk_using(0)
					.fk_member(request.getFk_member())
					.fk_device(request.getFk_device())
					.fd_using_date_start(request.getFd_using_date_start())
					.fd_using_date_end(request.getFd_using_date_end())
					.fd_using_total_min(request.getFd_using_total_min())
					.fd_using_total_price(request.getFd_using_total_price())
					.build();
		}
	}

	@Override
	public UsingDto.Response returnUsing(UsingDto.Request request) {
		if (mapper.returnUsing(request) != 1) {
			return UsingDto.Response.builder()
					.pk_using(-1)
					.fk_member("")
					.fk_device("")
					.fd_using_date_start("")
					.fd_using_date_end("")
					.fd_using_total_min("")
					.fd_using_total_price("")
					.build();
		} else {
			return UsingDto.Response.builder()
					.pk_using(0)
					.fk_member(request.getFk_member())
					.fk_device(request.getFk_device())
					.fd_using_date_start(request.getFd_using_date_start())
					.fd_using_date_end(request.getFd_using_date_end())
					.fd_using_total_min(request.getFd_using_total_min())
					.fd_using_total_price(request.getFd_using_total_price())
					.build();
		}
	}

	@Override
	public UsingDto.Response routeUsing(UsingDto.Request request) {
		// TODO Auto-generated method stub
		return null;
	}



	
}

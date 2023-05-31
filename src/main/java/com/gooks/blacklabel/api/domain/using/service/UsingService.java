package com.gooks.blacklabel.api.domain.using.service;

import java.util.List;

import com.gooks.blacklabel.api.domain.using.dto.UsingDto;

public interface UsingService {
	List<UsingDto.Response> getUsingList();
	UsingDto.Response getUsing(int request);
	UsingDto.Response useUsing(UsingDto.Request request);
	UsingDto.Response returnUsing(UsingDto.Request request);
	UsingDto.Response routeUsing(UsingDto.Request request);
}

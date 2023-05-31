package com.gooks.blacklabel.api.domain.using.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gooks.blacklabel.api.domain.using.dto.UsingDto;

@Mapper
public interface UsingMapper {
	List<UsingDto.Response> getUsingList();
	UsingDto.Response getUsing(int request);
	int useUsing(UsingDto.Request request);
	int returnUsing(UsingDto.Request request);
	int routeUsing(UsingDto.Request request);
}
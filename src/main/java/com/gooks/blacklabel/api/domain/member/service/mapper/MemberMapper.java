package com.gooks.blacklabel.api.domain.member.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gooks.blacklabel.api.domain.member.dto.MemberDto;

@Mapper
public interface MemberMapper {    
	List<MemberDto.Response>getMemberList();
	MemberDto.Response getMember(int request);
	int registMember(MemberDto.Request request);
	int updateMember(MemberDto.Request request);
    int deleteMember(int request);
    
}

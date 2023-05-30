package com.gooks.blacklabel.api.domain.member.service;

import java.util.List;

import com.gooks.blacklabel.api.domain.member.dto.MemberDto;


public interface MemberService {
	List<MemberDto.Response> getMemberList();
	MemberDto.Response getMember(int request);
	MemberDto.Response registMember(MemberDto.Request request);
	MemberDto.Response updateMember(MemberDto.Request request);
	MemberDto.Response deleteMember(int request); 
}

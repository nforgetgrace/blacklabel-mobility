package com.gooks.blacklabel.api.domain.member.service.impl;


import com.gooks.blacklabel.api.domain.member.dto.MemberDto;
import com.gooks.blacklabel.api.domain.member.service.MemberService;
import com.gooks.blacklabel.api.domain.member.service.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberMapper mapper;

    @Override
    public List<MemberDto.Response> getMemberList(){
    	return mapper.getMemberList();
    }
    
    
    @Override
    public MemberDto.Response getMember(int request) {       
    	return mapper.getMember(request);
    }
    
    
    @Override
    public MemberDto.Response registMember(MemberDto.Request request) {
        
        if (mapper.registMember(request) != 1) {
        	return MemberDto.Response.builder()
            		.pk_member(-1)
            		.fd_member_mobile("")
            		.fd_member_nick("")
            		.fd_member_birth_year("")
            		.fd_member_gender("")
            		.fd_member_push_yn("")
            		.fd_member_join_date("")
            		.fd_member_login_date("")
            		.fd_member_status("")	
            		.fd_member_update_date("")
            		.fd_member_active_date("")
            		.build();
        } else {
            return MemberDto.Response.builder()
            		.pk_member(0)
            		.fd_member_mobile(request.getFd_member_mobile())
            		.fd_member_nick(request.getFd_member_nick())
            		.fd_member_birth_year(request.getFd_member_birth_year())
            		.fd_member_gender(request.getFd_member_gender())
            		.fd_member_push_yn(request.getFd_member_push_yn())
            		.fd_member_join_date(request.getFd_member_join_date())
            		.fd_member_login_date(request.getFd_member_login_date())
            		.fd_member_status(request.getFd_member_status())
            		.fd_member_update_date(request.getFd_member_update_date())
            		.fd_member_active_date(request.getFd_member_active_date())
            		.build();
        }
    }
    
    @Override
    public MemberDto.Response updateMember(MemberDto.Request request) {
        
        if (mapper.updateMember(request) != 1) {
        	return MemberDto.Response.builder()
            		.pk_member(-1)
            		.fd_member_mobile("")
            		.fd_member_nick("")
            		.fd_member_birth_year("")
            		.fd_member_gender("")
            		.fd_member_push_yn("")
            		.fd_member_join_date("")
            		.fd_member_login_date("")
            		.fd_member_status("")	
            		.fd_member_update_date("")
            		.fd_member_active_date("")
        			.build();
        } else {
            return MemberDto.Response.builder()
            		.pk_member(0)
            		.fd_member_mobile(request.getFd_member_mobile())
            		.fd_member_nick(request.getFd_member_nick())
            		.fd_member_birth_year(request.getFd_member_birth_year())
            		.fd_member_gender(request.getFd_member_gender())
            		.fd_member_push_yn(request.getFd_member_push_yn())
            		.fd_member_join_date(request.getFd_member_join_date())
            		.fd_member_login_date(request.getFd_member_login_date())
            		.fd_member_status(request.getFd_member_status())
            		.fd_member_update_date(request.getFd_member_update_date())
            		.fd_member_active_date(request.getFd_member_active_date())
            		.build();
        }
    }
    
    @Override
    public MemberDto.Response deleteMember(int request) {
        
    	MemberDto.Response data = mapper.getMember(request);

    	int rst = mapper.deleteMember(request);

    	if (rst != 1) {
        	return MemberDto.Response.builder()
		    		.pk_member(-1)
		    		.fd_member_mobile(null)
		    		.fd_member_nick(null)
		    		.fd_member_birth_year(null)
		    		.fd_member_gender(null)
		    		.fd_member_push_yn(null)
		    		.fd_member_join_date(null)
		    		.fd_member_login_date(null)
		    		.fd_member_status(null)	
		    		.fd_member_update_date(null)
		    		.fd_member_active_date(null)
					.build();
        	
        } else {
            return MemberDto.Response.builder()
		    		.pk_member(data.getPk_member())
		    		.fd_member_mobile(data.getFd_member_mobile())
		    		.fd_member_nick(data.getFd_member_nick())
		    		.fd_member_birth_year(data.getFd_member_birth_year())
		    		.fd_member_gender(data.getFd_member_gender())
		    		.fd_member_push_yn(data.getFd_member_push_yn())
		    		.fd_member_join_date(data.getFd_member_join_date())
		    		.fd_member_login_date(data.getFd_member_login_date())
		    		.fd_member_status(data.getFd_member_status())	
		    		.fd_member_update_date(data.getFd_member_update_date())
		    		.fd_member_active_date(data.getFd_member_active_date())
					.build();
        }
    }

}

package com.gooks.blacklabel.common.security.domain;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMemberMapper {

	Optional<AuthMember> findByMemberId(String request);	
    
}

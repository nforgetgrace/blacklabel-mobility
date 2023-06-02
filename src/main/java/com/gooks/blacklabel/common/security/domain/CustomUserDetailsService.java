package com.gooks.blacklabel.common.security.domain;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
 
    private final AuthMemberMapper authMemberMapper;
    private final PasswordEncoder passwordEncoder;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	AuthMember member = new AuthMember();
    	member = authMemberMapper.findByMemberId(username).orElseThrow(EntityNotFoundException::new);
    	return member;
    }
 
    // 해당하는 User 의 데이터가 존재한다면 UserDetails 객체로 만들어서 리턴
    private UserDetails createUserDetails(AuthMember member) {
        return User.builder()
                .username(member.getUsername())
                .password(passwordEncoder.encode(member.getPassword()))
                .roles(member.getRoles().toArray(new String[0]))
                .build();
    }
}
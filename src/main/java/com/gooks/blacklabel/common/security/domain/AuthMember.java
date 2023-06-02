package com.gooks.blacklabel.common.security.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthMember implements UserDetails {

    private String member_id;

    private String member_password;

    private String roles;
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    	Collection<GrantedAuthority> collectors = new ArrayList<>();
		collectors.add(()->{return roles;}); //add에 들어올 파라미터는 GrantedAuthority밖에 없으니 
		
		return collectors;
    }
 
    @Override
    public String getUsername() {
        return member_id;
    }
 
    @Override
    public String getPassword() {
        return member_password;
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
}
package com.gooks.blacklabel.common.security.domain;

import lombok.Data;

@Data
public class MemberLoginRequestDto {
    private String memberId;
    private String password;
}
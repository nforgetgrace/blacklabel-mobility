package com.gooks.blacklabel.api.domain.member.dto;

import lombok.*;


@Data
public class MemberDto {


	
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    @Data
    public static class Request {

    	private int    pk_member ;
        private String fd_member_mobile;
        private String fd_member_nick;
        private String fd_member_birth_year;
        private String fd_member_gender;
        private String fd_member_push_yn;
        private String fd_member_join_date;
        private String fd_member_login_date;
        private String fd_member_status;
        private String fd_member_update_date;
        private String fd_member_active_date;
    }
	
    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    public static class Response {

    	private int    pk_member ;
        private String fd_member_mobile;
        private String fd_member_nick;
        private String fd_member_birth_year;
        private String fd_member_gender;
        private String fd_member_push_yn;
        private String fd_member_join_date;
        private String fd_member_login_date;
        private String fd_member_status;
        private String fd_member_update_date;
        private String fd_member_active_date;
		 
    }
    
}

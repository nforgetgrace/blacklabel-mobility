package com.gooks.blacklabel.api.domain.using.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UsingDto {

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    @Data
    public static class Request {
    	
    	private int 	pk_using;
    	private String fk_member;
    	private String fk_device;
    	private String fd_using_date_start;
    	private String fd_using_date_end;
    	private String fd_using_total_min;
    	private String fd_using_total_price;
    }
    
    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    public static class Response {
    	
    	private int 	pk_using;
    	private String fk_member;
    	private String fk_device;
    	private String fd_using_date_start;
    	private String fd_using_date_end;
    	private String fd_using_total_min;
    	private String fd_using_total_price;
    	
    }
    
}

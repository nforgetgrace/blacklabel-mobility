package com.gooks.blacklabel.api.domain.sample.dto;

import lombok.*;


@Data
public class SampleDto {


	@Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    public static class Response {

		 private int pk_sample_table;
		 private String fd_sample;
        
    }
    
}

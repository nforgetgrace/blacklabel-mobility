package com.gooks.blacklabel.api.domain.device.dto;

import lombok.*;


@Data
public class DeviceDto {


	
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    @Data
    public static class Request {
    	private int    pk_device;
        private String fd_device_serial;
        private String fd_device_type;
        private String fd_device_status;
        private String fd_device_soc;

    }
	
    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @Builder
    public static class Response {

		 private int    pk_device;
		 private String fd_device_type;
		 private String fd_device_status;
		 private String fd_device_soc;
		 private String fd_device_serial;
		 
    }
    
}

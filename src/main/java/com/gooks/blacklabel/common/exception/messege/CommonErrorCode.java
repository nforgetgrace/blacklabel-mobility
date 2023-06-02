package com.gooks.blacklabel.common.exception.messege;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
* @package : com.gooks.blacklabel.common.exception.messege
* @name : CommonErrorCode.java
* @date : 2022-12-14 오후 4:16
* @author : Jung Jae gook
* @version : 1.0.0
* @modifyed :
* @description : 공통 에러응답 메시지
**/
@Getter
@AllArgsConstructor
public enum CommonErrorCode implements ErrorCode{

    UNHANDLED_ERROR("COMMON_000", "서비스 오류가 발생했습니다. 서버관리자에게 문의해 주세요.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_REQUEST("COMMON_001", "정상적인 요청이 아닙니다."),
    INVALID_REQUEST_PARAM("COMMON_002", "요청 파라미터가 존재하지 않거나, 정확하지 않습니다. 파라미터를 확인해 주세요."),
    CONNECTION_RESET("COMMON_003","연동 서버로부터 응답을 받지 못했습니다. 연동 서버의 상태를 확인해 주세요.", HttpStatus.SERVICE_UNAVAILABLE),
    ILLEGAL_ARGUMENT("COMMON_004","정상적인 요청값이 아닙니다. 요청값을 확인해 주세요."),
    INTERNAL_ERROR("COMMON_005","서비스 처리중 문제가 발생했습니다. 서버관리자에게 문의해 주세요.", HttpStatus.INTERNAL_SERVER_ERROR),
    SQL_VIOLATION("COMMON_006","데이터베이스와 연동하는 중에 오류가 발생하였습니다. 서버관리자에게 문의해 주세요.", HttpStatus.INTERNAL_SERVER_ERROR),
    NON_LOGIN_STATUS("COMMON_007", "로그인 상태가 아닙니다. 로그인 후 다시 시도해주세요.", HttpStatus.NOT_IMPLEMENTED),
    UNAUTHORIZED("COMMON_008", "인가되지 않은 요청입니다.", HttpStatus.UNAUTHORIZED)
    ;

    String code;
    String message;
    HttpStatus httpStatus;

    CommonErrorCode(String code, String message) {
        this(code, message, HttpStatus.BAD_REQUEST);
    }
}

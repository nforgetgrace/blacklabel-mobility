package com.gooks.blacklabel.api.domain.member.controller;

import com.gooks.blacklabel.api.domain.member.dto.MemberDto;
import com.gooks.blacklabel.api.domain.member.service.MemberService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.data.rest.core.annotation.Description;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * com.gooks.blacklabel.api.domain.sample.controller
 * </pre>
 * 	
 * @설명 원준씨를 위한 샘플코드
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/list")
    @Description("회원 리스트를 조회한다")
    public List<MemberDto.Response> getMemberList() {
        return memberService.getMemberList();
    }
    
    
    @GetMapping("/get")
    @Description("회원을 조회합니다.")
//    public MemberDto.Response getMember(@RequestParam(name = "fd_member_serial") String request) {
    public MemberDto.Response getMember(@RequestParam String request) {
        return memberService.getMember(Integer.parseInt(request));
    }
    
    @PostMapping("/regist")
    @Description("회원을 등록합니다.")
    public MemberDto.Response registMember(@RequestBody MemberDto.Request request) {
        return memberService.registMember(request);
    }
    
    @PutMapping("/update")
    @Description("회원 정보를 업데이트합니다.")
    public MemberDto.Response updateMember(@RequestBody MemberDto.Request request) {
        return memberService.updateMember(request);
    }
    
    @DeleteMapping("/delete")
    @Description("회원 정보를 삭제합니다.")
    public MemberDto.Response deleteMember(@RequestParam String request) {
        return memberService.deleteMember(Integer.parseInt(request));
    }

}
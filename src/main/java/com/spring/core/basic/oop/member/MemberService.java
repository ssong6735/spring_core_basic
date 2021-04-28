package com.spring.core.basic.oop.member;

// 회원 정보 전처리/후처리 역할
public interface MemberService {

    // 회원 가입 요청 처리 기능
    void join(Member member);

    // 회원 조회 요청 처리 기능
    Member findMember(Long memverId);

}

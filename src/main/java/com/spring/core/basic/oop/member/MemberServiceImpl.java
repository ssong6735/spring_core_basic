package com.spring.core.basic.oop.member;

// 회원 서비스 구현체
// 역할: 적당한 회원 저장소에 CRUD 명령을 내리는 역할
public class MemberServiceImpl implements MemberService {

    // 회원 저장소와 의존관계
    private final MemberRepository memberRepository;

    /*
    public MemberServiceImpl() {
        this.memberRepository = new MemoryMemberRepository();
    }
    */

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memverId) {
        Member findMember = memberRepository.findById(memverId);
        return findMember;
    }
}

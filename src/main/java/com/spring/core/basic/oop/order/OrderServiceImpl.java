package com.spring.core.basic.oop.order;

import com.spring.core.basic.oop.discount.DiscountPolicy;
import com.spring.core.basic.oop.discount.FixDiscountPolicy;
import com.spring.core.basic.oop.discount.RateDiscountPolicy;
import com.spring.core.basic.oop.member.Member;
import com.spring.core.basic.oop.member.MemberRepository;
import com.spring.core.basic.oop.member.MemoryMemberRepository;

/*
    역할: 적당한 회원 저장소에서 회원정보를 조회한 후
          회원 등급에 따라 적당한 할인정책에 의한 할인을 적용한
          주문정보를 생성해야 함.
*/
public class OrderServiceImpl implements OrderService {

    // 적당한 회원저장소 의존 (추상화된 객체와 의존관계 만들기)
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    /* OCP 위반 코드
    public OrderServiceImpl() {
        this.memberRepository = new MemoryMemberRepository();
        this.discountPolicy = new RateDiscountPolicy();
    }
    */

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member findMember = memberRepository.findById(memberId);
        int discount = discountPolicy.discount(findMember, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);
    }

}

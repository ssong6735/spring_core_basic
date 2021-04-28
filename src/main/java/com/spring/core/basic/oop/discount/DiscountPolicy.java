package com.spring.core.basic.oop.discount;

import com.spring.core.basic.oop.member.Member;

public interface DiscountPolicy {
    /**
     * 할인 정책별 할인액 계산 기능
     * @param member - 할인 대상 회원정보
     * @param itemPrice - 구매 금액
     * @return - 계산된 할인액수
     */
    int discount(Member member, int itemPrice);
}

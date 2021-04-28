package com.spring.core.basic.oop.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@AllArgsConstructor
public class Order {

    private Long memberId; // 주문한 회원의 아이디
    private String itemName; // 상품명
    private int itemPrice; // 상품금액
    private int discountPrice; // 할인액

    // 최종 결제액 계산 기능
    public int calcFinalPrice() {
        //return 상품금액 - 할인액;
        return itemPrice - discountPrice;
    }

}

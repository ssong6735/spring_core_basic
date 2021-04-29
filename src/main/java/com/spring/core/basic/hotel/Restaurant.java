package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 스캔 대상인것을 알림
@RequiredArgsConstructor // final 붙은 생성자를 자동으로 만들어준다.
public class Restaurant {

    // 요리사(쉐프)와 의존관계
    // final 이 붙으면 필수의존관계
    //@Autowired // 필드주입
    private final Chef chef;

    // 레스토랑에 예약이 되면 누군가가 요리사를 주입해줬으면 좋겠다.
    //@Autowired // 생성자를 자동으로 찾아서 주입해라. // 생성자 주입
    /*public Restaurant(Chef chef) {
        this.chef = chef;
    }*/

    /*@Autowired // 세터주입
    public void setChef(Chef chef) {
        this.chef = chef;
    }*/

    // 저녁 식사 주문 기능
    public void orderDinner() {
        System.out.println("저녁 식사를 주문합니다.");
        chef.cook();
    }

}

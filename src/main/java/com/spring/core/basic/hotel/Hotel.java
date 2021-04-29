package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 스캔 대상인것을 알림
@RequiredArgsConstructor // final 붙은 생성자를 자동으로 만들어준다.
public class Hotel {

    // 레스토랑과 의존관계 필드 생성
    //@Autowired
    private final Restaurant restaurant;

    // 호텔이 만들어질때 누군가가 레스토랑을 주입해줬으면 좋겠다.
    //@Autowired // 생성자를 자동으로 찾아서 주입해라.
    /*public Hotel(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/

    /*@Autowired // 생성자를 자동으로 찾아서 주입해라. //세터주입
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/

    // 레스토랑 예약기능
    public void reserveRestaurant() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }

}

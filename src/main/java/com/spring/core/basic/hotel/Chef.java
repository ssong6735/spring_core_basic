package com.spring.core.basic.hotel;

import org.springframework.stereotype.Component;

@Component // 스캔 대상인것을 알림
public class Chef {

    // 요리 기능
    public void cook() {
        System.out.println("요리사가 요리를 합니다.");
    }

}

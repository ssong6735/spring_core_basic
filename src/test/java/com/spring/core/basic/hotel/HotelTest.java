package com.spring.core.basic.hotel;

import com.spring.core.basic.config.HotelAutoConfig;
import com.spring.core.basic.config.HotelConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class HotelTest {

    @Test
    @DisplayName("호텔을 만들면 자동으로 예약되고 요리가 시작된다. -> JAVA")
    void hotelTest() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HotelConfig.class);

        Hotel hotel = context.getBean(Hotel.class);

        hotel.reserveRestaurant();
    }


    @Test
    @DisplayName("호텔을 만들면 자동으로 예약되고 요리가 시작된다. -> XML")
    void hotelTest2() {

        ApplicationContext context = new GenericXmlApplicationContext("hotelConfig.xml");

        Hotel hotel = context.getBean(Hotel.class);

        hotel.reserveRestaurant();
    }


    @Test
    @DisplayName("호텔을 만들면 자동으로 예약되고 요리가 시작된다. -> JAVA (자동설정)")
    void hotelTest3() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HotelAutoConfig.class);

        Hotel hotel = context.getBean(Hotel.class);

        hotel.reserveRestaurant();
    }

}
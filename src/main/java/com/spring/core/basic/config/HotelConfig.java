package com.spring.core.basic.config;

import com.spring.core.basic.hotel.Chef;
import com.spring.core.basic.hotel.Hotel;
import com.spring.core.basic.hotel.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelConfig {

    // 리턴 타입은 필요한 객체, 메소드 이름은 빈의 이름

    //생성자 주입
    /*@Bean
    public Chef chef() {
        return new Chef();
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant(chef());
    }

    @Bean
    public Hotel hotel() {
        return new Hotel(restaurant());
    }*/

    //세터 주입
    /*@Bean
    public Chef chef() {
        return new Chef();
    }

    @Bean
    public Restaurant restaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setChef(chef());
        return restaurant;
    }

    @Bean
    public Hotel hotel() {
        Hotel hotel = new Hotel();
        hotel.setRestaurant(restaurant());
        return hotel;
    }*/


}

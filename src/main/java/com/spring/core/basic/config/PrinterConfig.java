package com.spring.core.basic.config;

import com.spring.core.basic.printer.Paper;
import com.spring.core.basic.printer.Printer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

// 프린터가 필요한 객체를 생성하고 주입해주는 설정 클래스
// 스프링 컨테이너 설정 방법
@Configurable // 이 클래스는 스프링 컨테이너 설정 클래스 입니다.
public class PrinterConfig {

    // 빈(Bean) 등록: 컨테이너에 필요한 객체를 미리 생성하는 개념
    // @Bean(name = "A4paper") // Bean 에 이름 등록(리턴타입이 똑같아서 구분 가능하게 이름 부여)
    @Bean // 빈의 이름을 등록하지 않으면 메서드 이름이 빈의 이름으로 결정됨.
    public Paper paper() {
        return new Paper(Arrays.asList("자바", "스프링", "DI컨테이너"));
    }

    @Bean // 빈의 이름 printer
    public Printer printer() {
        return new Printer(paper());
    }

}

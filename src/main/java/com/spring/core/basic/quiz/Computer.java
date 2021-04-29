package com.spring.core.basic.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // 스캔 대상인것을 알림
//@RequiredArgsConstructor // final 붙은 생성자를 자동으로 만들어준다.
public class Computer {

    private final Keyboard keyboard;
    private final Monitor monitor;
    private final Mouse mouse;

    @Autowired // 생성자를 자동으로 찾아서 주입해라.
    public Computer(
            @Qualifier("skb") Keyboard keyboard,
            @Qualifier("appleMonitor") Monitor monitor,
            @Qualifier("lgMouse") Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public void info() {
        keyboard.info();
        monitor.info();
        mouse.info();
    }

}

package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component
public class AppleMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("애플 모니터!");
    }
}

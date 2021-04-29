package com.spring.core.basic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정파일이라고 선언
@ComponentScan(basePackages = "com.spring.core.basic.quiz") // 이 패키지 밑에서 부품들을 자동 스캔해라.
public class ComputerConfig { }

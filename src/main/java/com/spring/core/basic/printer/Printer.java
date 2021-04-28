package com.spring.core.basic.printer;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Printer {

    // 종이와 의존관계 : 종이가 없으면 출력 기능을 사용할 수 없다.
    private Paper paper;

    // 주입자에게 제어권 넘기기: 제어의 역전
    public Printer(Paper paper) {
        this.paper = paper;
    }

    // 용지 출력 기능
    public void printPaper() {
        System.out.println("========== 출력 내용 ==========");
        for (String data : paper.getDatas()) {
            System.out.println("# " + data);
        }
    }


}

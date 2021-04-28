package com.spring.core.basic.printer;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class Paper {

    private List<String> datas;

    public Paper(List<String> datas) {
        this.datas = datas;
    }
}

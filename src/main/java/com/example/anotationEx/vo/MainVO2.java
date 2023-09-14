package com.example.anotationEx.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class MainVO2 {

    private String a = "1";
    private String b = "2";
}

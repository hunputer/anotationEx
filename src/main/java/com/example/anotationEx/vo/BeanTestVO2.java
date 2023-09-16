package com.example.anotationEx.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class BeanTestVO2 {

    private String var1 = "BeanTest2_var1";
    private String var2 = "BeanTest2_var2";
}

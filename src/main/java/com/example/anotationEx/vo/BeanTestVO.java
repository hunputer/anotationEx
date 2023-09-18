package com.example.anotationEx.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BeanTestVO{

    private String var1;
    private String var2;
    private List<EnumEx> enumEx;
    private List<EnumEx2> enumExAbc;

}

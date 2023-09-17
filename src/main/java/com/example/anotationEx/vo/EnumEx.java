package com.example.anotationEx.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public enum EnumEx {
    NEW("a"),
    ONGOING("b");

    public final String a;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static EnumEx from(@JsonProperty("a") String abc){
        for(EnumEx enumEx : EnumEx.values()){
            if(abc.equalsIgnoreCase(enumEx.getA())){
                return enumEx;
            }
        }
        return null;
    }
}

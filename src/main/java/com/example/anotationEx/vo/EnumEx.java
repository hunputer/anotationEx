package com.example.anotationEx.vo;

import com.example.anotationEx.config.EnumMapperType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum EnumEx implements EnumMapperType {
    NEW("a","abc"),
    ONGOING("b", "res");

    public final String id;
    public final String b;


    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static EnumEx from(@JsonProperty("a") String abc){
        for(EnumEx enumEx : EnumEx.values()){
            if(abc.equalsIgnoreCase(enumEx.getId())){
                return enumEx;
            }
        }
        return null;
    }


    @Override
    public String getCode() {
        return name();
    }
}

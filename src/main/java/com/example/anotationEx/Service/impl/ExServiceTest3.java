package com.example.anotationEx.Service.impl;

import com.example.anotationEx.Service.ExService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;


@Service
@ConditionalOnProperty(name = "pattern.test", havingValue = "test3")
public class ExServiceTest3 implements ExService {
    @Override
    public String getValue() {
        return "test3";
    }
}

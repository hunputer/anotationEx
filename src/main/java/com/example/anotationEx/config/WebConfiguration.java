package com.example.anotationEx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {

        ConverterFactory converterFactory = new StringToEnumConverterFactory();
        registry.addConverterFactory(converterFactory);
    }
}

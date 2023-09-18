package com.example.anotationEx.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToEnumConverterFactory implements ConverterFactory<String, Enum<? extends EnumMapperType>> {
    @Override
    public <T extends Enum<? extends EnumMapperType>> Converter<String, T> getConverter(Class<T> targetType) {
        return new IdCodeToEnumConverter<>(targetType);
    }

    private static final class IdCodeToEnumConverter<T extends Enum<? extends EnumMapperType>> implements Converter<String, T> {

        private final Map<Integer, T> map;

        public IdCodeToEnumConverter(Class<T> targetEnum) {
            map = Arrays.stream(targetEnum.getEnumConstants())
                    .collect(Collectors.toMap(enumConstant -> ((EnumMapperType) enumConstant).getAbc(), Function.identity()));
        }

        @Override
        public T convert(String source) {
            //해당 값 존재 여부 확인
            if (!StringUtils.hasText(source)) {
                return null;
            }

            Integer legacyCode = null;
            try {
                legacyCode = Integer.parseInt(source);
            } catch (Exception e) {
                // 변환 실패시 Exception 처리
                throw new IllegalArgumentException("IllegalArgumentException");
            }

            T value = map.get(legacyCode);
            if (value == null) {
                throw new IllegalArgumentException("IllegalArgumentException");
            }
            return value;
        }
    }
}

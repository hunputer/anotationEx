package com.example.anotationEx.config;

import com.example.anotationEx.vo.BeanTestVO;
import com.example.anotationEx.vo.BeanTestVO2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExConfig {

    @Bean
    public BeanTestVO abc(BeanTestVO2 beanTestVO2){
        System.out.println("=======bean이 실행됩니다======");
        BeanTestVO beanTestVO = new BeanTestVO();
        beanTestVO.setVar1("BeanTest1_var1");
        beanTestVO.setVar2(beanTestVO2.getVar2());

        return beanTestVO;
    }


}

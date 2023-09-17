package com.example.anotationEx.Controller;

import com.example.anotationEx.vo.BeanTestVO;
import com.example.anotationEx.vo.EnumEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private BeanTestVO beanTestVO;

    @GetMapping("")
    public void main(){
        System.out.println(beanTestVO.getVar1());
        System.out.println(beanTestVO.getVar2());
    }

    @GetMapping("/ex")
    public void ex(@ModelAttribute BeanTestVO beanTestVO){
        List<EnumEx> enumExList = beanTestVO.getEnumEx();

        for(EnumEx ex : enumExList){
            System.out.println(ex);
        }
    }

}

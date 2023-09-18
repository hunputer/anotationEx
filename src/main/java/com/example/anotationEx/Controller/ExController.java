package com.example.anotationEx.Controller;

import com.example.anotationEx.Service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex")
public class ExController {

    @Autowired
    private ExService exService;

    @GetMapping("")
    public void main(){
        System.out.println(exService.getValue());
    }

}

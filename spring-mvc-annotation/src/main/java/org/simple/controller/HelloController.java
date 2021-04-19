package org.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello Spring MVC!");
        //返回的字符串的名字及就是视图的名称,会被视图解析器处理
        return "hello";
    }

}

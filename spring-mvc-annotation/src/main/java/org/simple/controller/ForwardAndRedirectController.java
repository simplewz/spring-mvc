package org.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardAndRedirectController {

    //SpringMVC在配置了视图解析器的情况下,默认使用转发,转发到指定的视图
    @GetMapping("/default-forward")
    public String defaultForward(Model model){
        model.addAttribute("msg","defaultForward");
        return "/default-forward";
    }

    //返回的是 forward:请求  表示转发到指定请求。
    @GetMapping("/forward")
    public String forward(Model model){
        model.addAttribute("msg","forward");
        return "forward:/default-forward";
    }

    //如果返回字符串为:redirect:请求   表示重定向到指定请求
    @GetMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("msg","redirect");
        return "redirect:/forward";
    }

}

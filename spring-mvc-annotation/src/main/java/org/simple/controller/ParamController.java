package org.simple.controller;

import org.simple.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ParamController {

    /**
     * SpringMVC默认如果参数与方法中的参数一致时,controller可以正常接收到前端所传的参数值
     * 如果前端与controller中定义的方法中的参数不同名时，可以在controller中使用@RequestParam
     * 注解进行不同名的参数接收。@RequestParam可以指定参数名与前端的参数名一致，并且可以设置是否
     * 必传以及进行参数默认值设置。
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/getUserName")
    public String test(@RequestParam(value = "username") String name, Model model){
        model.addAttribute("msg","name is :"+name);
        return "hello";
    }

    /**
     * 接收对象参数
     * @param user
     * @param model
     * @return
     */
    @PostMapping("/user")
    public String addUser(User user,Model model){
        System.out.println("数据添加成功！");
        System.out.println(user);
        model.addAttribute("msg","添加成功");
        return "hello";
    }


}

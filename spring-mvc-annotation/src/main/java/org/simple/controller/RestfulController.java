package org.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Restful风格的URL表示一种URL风格,这种风格的URL通过以不同的请求方式实现对资源的不同操作。
 *
 * 通常有如下请求方式与资源操作动作对应关系：
 * GET     查询
 * POST    添加
 * PUT     修改
 * DELETE  删除
 *
 * 符合Restful风格的URL格式通常如下：
 * http://host:port/source/{param1}/{param2}/.../{paramN}
 *
 * 如：
 * http://localhost:8080/order/1001   GET     查询编号为1001的订单
 * http://localhost:8080/order        POST    新增一条订单记录
 * http://localhost:8080/order        PUT     修改一条订单记录
 * http://localhost:8080/order/1001   DELETE  删除订单编号为1001的订单
 *
 * Restful风格的URL用不同的请求方式实现对资源的不同操作，使URL更加简洁，避免了传统的URL拼接不同参数容易出错的问题。
 *
 * ！在SpringMVC中，使用Restful风格的URL时，需要在方法中使用@PathVariable注解标注方法中的参数与请求路径中的参数对应问题。
 */
@Controller
public class RestfulController {

    //http://localhost:8080/sum?a=1&b=2
    @RequestMapping(value = "/sum",method = RequestMethod.GET)
    public String custom(int a, int b, Model model){
        int result=a+b;
        model.addAttribute("result",result);
        return "sum";
    }

    //http://localhost:8080/sum/2/3
    //@GetMapping("/sum/{a}/{b}") 与下面的注解等效
    @RequestMapping(value = "/sum/{a}/{b}",method = RequestMethod.GET)
    public String restful(@PathVariable("a") int a, @PathVariable("b") int b, Model model){
        int result=a+b;
        model.addAttribute("result",result);
        return "sum";
    }
}

package com.Lijiacheng.controller;

import com.Lijiacheng.domian.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String username, Integer age){
        System.out.println("来自浏览器的普通参数传递 name =====>" + username);
        System.out.println("来自浏览器的普通参数传递 age =====>" + age);
        return "{'module':'commonParam'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("来自浏览器的pojo参数传递 user =====>" + user);
        return "{'module','pojoParam'}";
    }

    @RequestMapping("/containPojoParam")
    @ResponseBody
    public String containPojoParam(User user){
        System.out.println("来自浏览器的嵌套pojo参数传递 user =====>" + user.toString());
        return "{'module','pojoParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("来自浏览器的数组参数传递 likes =====>" + Arrays.toString(likes));
        return "{'module','arrayParam'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("来自浏览器的列表参数传递 likes =====>" + likes);
        return "{'module','listParam'}";
    }

    // 使用@RequestBody注解将外部传递的json数组数据映射到形参的集合对象中作为数据
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("来自浏览器的JSON普通数组参数传递 likes =====>" + likes);
        return "{'module','listParamForJson'}";
    }

    @RequestMapping("/pojoForJson")
    @ResponseBody
    public String pojoForJson(@RequestBody User user){
        System.out.println("来自浏览器的JSON实体类对象参数传递 User =====>" + user);
        return "{'module','pojoForJson'}";
    }

    @RequestMapping("/listPojoForJson")
    @ResponseBody
    public String listPojoForJson(@RequestBody List<User> users){
        System.out.println("来自浏览器的JSON对象数组参数传递 users =====>" + users);
        return "{'module','listPojoForJson'}";
    }

    // 接收日期数据
    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2)
    {
        System.out.println("来自浏览器的日期参数传递 date =====>" + date);
        System.out.println("来自浏览器的日期参数传递 date1(YYYY-MM-dd) =====>" + date1);
        System.out.println("来自浏览器的日期参数传递 date2(YYYY-MM-dd HH:mm:ss)" + date2);
        return "{'module','dataParam'}";
    }
}

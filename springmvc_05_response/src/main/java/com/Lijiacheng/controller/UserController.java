package com.Lijiacheng.controller;

import com.Lijiacheng.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // 不能使用@responseBody，否则会把"page.jsp"当做字符串返回，这里需要返回页面
    @RequestMapping("/jumpToPage")
    public String jumpToPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    @RequestMapping("/toPojoJson")
    @ResponseBody
    public User toPojoJson(){
        System.out.println("返回json格式的对象类型");
        User user = new User();
        user.setName("李嘉诚123");
        user.setAge(22);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json对象列表的类型");
        User u1 = new User();
        u1.setName("李嘉诚");
        u1.setAge(21);
        User u2 = new User();
        u2.setName("廖梓汀");
        u2.setAge(22);
        List<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        return users;
    }

}

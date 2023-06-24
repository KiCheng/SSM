package com.Lijiacheng.controller;

import com.Lijiacheng.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    /**
     * 设置当前请求方法为POST，表示REST风格中的添加操作
     * */
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(User user){
        System.out.println("user save..." + user);
        return "{'module':'user save'}";
    }

    /**
     * 设置当前请求方法为DELETE，表示REST风格中的删除操作
     * */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
//    public String delete(@PathVariable("id") Integer userid){
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    /**
     * 设置当前请求方法为PUT，表示REST风格中的修改操作
     * */
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }

    /**
     * 设置当前请求方法为GET，表示REST风格中的查询操作
     * */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getById..." + id);
        return "{'module':'user getById'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }
}

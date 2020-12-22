package com.imooc.mall.controller;

import com.imooc.mall.model.pojo.User;
import com.imooc.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author mofan
 * @date 2020/12/22 12:04
 */
@Controller
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/test")
    @ResponseBody
    public User t1() {
        return userService.getUser();
    }

}

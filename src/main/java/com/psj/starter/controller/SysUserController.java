package com.psj.starter.controller;


import com.psj.starter.bean.entity.SysUser;
import com.psj.starter.service.impl.SysUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户管理 前端控制器
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    SysUserServiceImpl sysUserService;

    @PostMapping("getAllUser")
    public List<SysUser> getAllUser(@RequestParam("name") String name, @RequestParam("age") Integer age){
        System.out.println("名字---"+name+"年龄---"+age);
        return sysUserService.getAllUser();
    }
    @GetMapping("getMsg")
    public String getMsg() throws InterruptedException {
        Thread.sleep(3000);
        return "你好呀";
    }

    @PostMapping("getMsgWithForm")
    public String getMsgWithForm(Object id) throws InterruptedException {
        System.out.println(id);
        return "收到了你传来的表单了";
    }

}

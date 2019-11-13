package com.psj.starter.controller;


import com.psj.starter.bean.ResultBean;
import com.psj.starter.bean.entity.SysUser;
import com.psj.starter.error.BusinessException;
import com.psj.starter._enum.EmBusinessError;
import com.psj.starter.mapper.SysUserMapper;
import com.psj.starter.service.impl.SysUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
public class SysUserController extends BaseController<SysUserMapper, SysUser> {
    @Autowired
    SysUserServiceImpl sysUserService;

    @GetMapping("getAllUser")
    public List<SysUser> getAllUser(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        System.out.println("名字---" + name + "年龄---" + age);
        return sysUserService.getAllUser();
    }

    @GetMapping("getByUserId")
    public ResultBean<Object> getByUserId(@RequestParam("id") String id) {
        System.out.println("请求接口层---" + id);
        SysUser result = baseService.getById(id);
        ResultBean<Object> resultBean = new ResultBean<Object>(result);
        return resultBean;
    }

    @GetMapping("getMsg")
    public String getMsg() {
        throw new BusinessException(EmBusinessError.PARAMS_VALIDATION_ERROR);
    }

    @PostMapping("getMsgWithForm")
    public String getMsgWithForm(Object id) throws InterruptedException {
        System.out.println(id);
        return "收到了你传来的表单了";
    }

}

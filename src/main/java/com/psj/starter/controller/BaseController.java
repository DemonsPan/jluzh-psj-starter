package com.psj.starter.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.psj.starter.bean.ResultBean;
import com.psj.starter.bean.entity.BaseEntiry;
import com.psj.starter.common.utils.ResultUtils;
import com.psj.starter.error.BusinessException;
import com.psj.starter.service.BaseService;
import com.psj.starter.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: jluzh-psj-starter
 * @description: 接口层基类，全局异常处理
 * @author: DemonsPan
 * @create: 2019-11-08 15:45
 **/
@Slf4j
public class BaseController<M extends BaseMapper<T>, T extends BaseEntiry> {
    @Autowired
    BaseServiceImpl<M, T> baseService;

    @GetMapping("getById")
    public ResultBean<Object> getByPk(String id) {
        T result = baseService.getById(id);
        return new ResultUtils<>().setData(result);
    }

    /*捕获所有没有处理的抛出的异常*/
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResultBean exceptionHandler(HttpServletRequest request, RuntimeException ex) {
        if (ex instanceof BusinessException) {
            return new ResultUtils<>().setErrorMsg(((BusinessException) ex).getErrCode(), ((BusinessException) ex).getErrMsg());
        }
        else {

        }
    }

}

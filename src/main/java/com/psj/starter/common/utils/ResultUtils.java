package com.psj.starter.common.utils;

import com.psj.starter._enum.EmResultStatus;
import com.psj.starter.bean.ResultBean;

/**
 * @program: jluzh-psj-starter
 * @description: 快捷返回结果工具类
 * @author: DemonsPan
 * @create: 2019-11-06 18:46
 **/
public class ResultUtils<T> {
    private ResultBean<T> result = new ResultBean();

    /*默认构造函数返回成功信息*/
    public ResultUtils() {
        this.result.setCode(EmResultStatus.SUCCESS.getCode());
        this.result.setMsg(EmResultStatus.SUCCESS.getMsg());
    }

    /*仅返回数据*/
    public ResultBean<T> setData(T t) {
        this.result.setData(t);
        this.result.setCode(EmResultStatus.SUCCESS.getCode());
        return this.result;
    }

    /*仅返回成功消息*/
    public ResultBean<T> setSuccessMsg(String msg) {
        this.result.setCode(EmResultStatus.SUCCESS.getCode());
        this.result.setMsg(msg);
        this.result.setData(null);
        return this.result;
    }

    /*返回带数据和成功的消息*/
    public ResultBean<T> setDataWithMsg(T t, String msg) {
        this.result.setData(t);
        this.result.setCode(EmResultStatus.SUCCESS.getCode());
        this.result.setMsg(msg);
        return this.result;
    }

    /*返回错误的消息和代码*/
    public ResultBean<T> setErrorMsg(Integer code, String msg) {
        this.result.setCode(code);
        this.result.setMsg(msg);
        return this.result;
    }

    /*仅返回错误代码*/
    public ResultBean<T> setErrorCode(Integer code) {
        this.result.setCode(EmResultStatus.FAIL.getCode());
        this.result.setMsg(EmResultStatus.FAIL.getMsg());
        this.result.setCode(code);
        return this.result;
    }
}


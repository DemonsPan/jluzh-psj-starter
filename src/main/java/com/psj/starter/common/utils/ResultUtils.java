//package com.psj.starter.common.utils;
//
//import com.psj.starter.bean.ResultBean;
//
///**
// * @program: jluzh-psj-starter
// * @description: 快捷返回结果工具类
// * @author: DemonsPan
// * @create: 2019-11-06 18:46
// **/
//public class ResultUtil<T> {
//    private ResultBean<T> result = new ResultBean();
//
//    public ResultUtil() {
//        this.result.setCode(true);
//        this.result.setMessage("success");
//        this.result.setCode(200);
//    }
//
//    public Result<T> setData(T t) {
//        this.result.setResult(t);
//        this.result.setCode(200);
//        return this.result;
//    }
//
//    public Result<T> setSuccessMsg(String msg) {
//        this.result.setSuccess(true);
//        this.result.setMessage(msg);
//        this.result.setCode(200);
//        this.result.setResult((Object)null);
//        return this.result;
//    }
//
//    public Result<T> setData(T t, String msg) {
//        this.result.setResult(t);
//        this.result.setCode(200);
//        this.result.setMessage(msg);
//        return this.result;
//    }
//
//    public Result<T> setErrorMsg(String msg) {
//        this.result.setSuccess(false);
//        this.result.setMessage(msg);
//        this.result.setCode(500);
//        return this.result;
//    }
//
//    public Result<T> setErrorMsg(Integer code, String msg) {
//        this.result.setSuccess(false);
//        this.result.setMessage(msg);
//        this.result.setCode(code);
//        return this.result;
//    }
//}
//

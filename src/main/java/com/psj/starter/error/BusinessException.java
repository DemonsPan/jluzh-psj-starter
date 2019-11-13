package com.psj.starter.error;

/**
 * @program: icmp-pc-starter
 * @description: 业务异常类
 * @author: DemonsPan
 * @create: 2019-11-08 15:49
 **/
public class BusinessException extends RuntimeException implements CommonError {
    private CommonError commonError;

    /*常规料*/
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    /*自定义错误信息*/
    public BusinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public Integer getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        return this.commonError.setErrMsg(errMsg);
    }
}

package com.psj.starter._enum;

import com.psj.starter.error.CommonError;

public enum EmBusinessError implements CommonError {

    /*错误无限延伸*/
    USER_NOT_EXIT(100001,"住户不存在"),
    PARAMS_VALIDATION_ERROR(100002,"参数不合法"),
    ;

    private Integer errCode;
    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public Integer getErrCode() {
        return this.errCode;
    }

    /*改变错误信息*/
    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
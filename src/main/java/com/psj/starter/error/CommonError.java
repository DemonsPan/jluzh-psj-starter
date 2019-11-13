package com.psj.starter.error;

public interface CommonError {
    String getErrMsg();
    Integer getErrCode();
    CommonError setErrMsg(String errMsg);

}
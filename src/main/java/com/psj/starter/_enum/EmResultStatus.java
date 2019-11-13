package com.psj.starter._enum;

/*统一返回结果的枚举类，响应码+结果消息*/
public enum EmResultStatus {
    SUCCESS(0, "操作成功"),
    FAIL(1, "操作失败"),
    NO_PERMISSION(2, "你没有该权限哦"),
    NO_LOGIN(-1, "你还没有登陆哦");

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    Integer code;
    String msg;

    EmResultStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

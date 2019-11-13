package com.psj.starter.bean;

import com.psj.starter._enum.EmResultStatus;

import java.io.Serializable;

import lombok.Data;

/**
 * @program: jluzh-psj-starter
 * @description: 统一返回接口
 * @author: DemonsPan
 * @create: 2019-11-06 17:36
 **/
@Data
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    private String msg;

    private Integer code;

    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = EmResultStatus.FAIL.getCode();
    }
}

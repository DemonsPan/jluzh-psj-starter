package com.psj.starter.service;

import com.psj.starter.bean.entity.SysUser;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
@Service
public interface ISysUserService{
    public List<SysUser> getAllUser();

}

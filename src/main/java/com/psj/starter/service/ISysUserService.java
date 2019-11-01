package com.psj.starter.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.psj.starter.bean.entity.SysUser;
import com.psj.starter.mapper.SysUserMapper;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
public interface ISysUserService extends IService<SysUser> {
    public List<SysUser> getAllUser();

}

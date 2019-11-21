package com.slx.bs.dao;

import com.slx.bs.po.SysUser;


public interface SysUserMapper {

     SysUser login(String userName , String password);
}

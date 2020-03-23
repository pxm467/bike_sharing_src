package com.slx.bs.service;

import com.slx.bs.po.Result;
import com.slx.bs.po.SysUser;

public interface SysUserService {

      Result login(String userName , String password);

      Result addUser(SysUser sysUser);

}

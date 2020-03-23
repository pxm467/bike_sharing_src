package com.slx.bs.dao;

import com.slx.bs.po.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SysUserMapper {

     SysUser login(@Param("userName")String userName ,@Param("password")  String password);

     int addUser(SysUser sysUser);
}

package com.slx.bs.controller;

import com.slx.bs.po.Result;
import com.slx.bs.po.SysUser;
import com.slx.bs.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sysUser")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "/login")
    public Result login(String userName , String password) {
        return sysUserService.login(userName , password);
    }

    @RequestMapping(value = "/addUser")
    public Result addUser(SysUser sysUser) {

        return sysUserService.addUser(sysUser);
    }

}

package com.slx.bs.service.impl;

import com.slx.bs.dao.SysUserMapper;
import com.slx.bs.po.Result;
import com.slx.bs.po.SysUser;
import com.slx.bs.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Component
@Service
public class SysUserServiceImpl  implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public Result login(String userName, String password) {
        Result result = Result.newInstance().success();
        SysUser sysUser = sysUserMapper.login(userName,password);
        if(StringUtils.isEmpty(sysUser)){
            result.failure().setMsg("账号密码错误");
            return result;
        }
        result.setData(sysUser);
        return result;
    }

    @Override
    public Result addUser(SysUser sysUser) {
        Result result = Result.newInstance().success();
        int k = sysUserMapper.addUser(sysUser);
        if(k != 1){
            return result.failure();
        }
        return result;
    }
}

package com.user.permission.controller;

import com.user.permission.util.PermissionResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制器
 * @Auther: wb-kkn510564
 * @Date: 2019/3/19 17:32
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 用户分页查询
     * @return
     */
    @RequestMapping(value = "/pageQuery", method = RequestMethod.GET)
    public PermissionResult pageQuery() {
        return null;
    }
}

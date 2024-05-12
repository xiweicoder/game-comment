package com.lfs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lfs.dto.LoginFormDTO;
import com.lfs.dto.Result;
import com.lfs.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 西尾coding
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}

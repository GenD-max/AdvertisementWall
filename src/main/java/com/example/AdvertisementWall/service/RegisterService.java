package com.example.AdvertisementWall.service;

import com.example.AdvertisementWall.pojo.Register;

/**
 * @author Зөндөө
 * @create 2021-06-03 23:15
 */
public interface RegisterService {
        /**
         * 注册用户 保存用户信息
         * @param register
         */
    public void registRegister(Register register);

    /**
     * 登录
     * @param register
     * @return 如果返回null，说明登录失败，返回有值，是登录成功
     */
    public Register login(Register register);

    /**
     * 检查 用户名是否可用
     * @param id
     * @return 返回true表示用户名已存在，返回false表示用户名可用
     */
    public boolean existsId(String id);

    /**
     * 查询用户数量
     * @param
     * @return 返回true表示用户名已存在，返回false表示用户名可用
     */
    public Long queryRegisterNum();
}

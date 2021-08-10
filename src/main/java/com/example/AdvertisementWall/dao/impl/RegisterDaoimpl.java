package com.example.AdvertisementWall.dao.impl;

import com.example.AdvertisementWall.dao.RegisterDao;
import com.example.AdvertisementWall.pojo.Register;

/**
 * @author Зөндөө
 * @create 2021-06-03 21:05
 */
public class RegisterDaoimpl extends BaseDao implements RegisterDao {
    //按id查询
    @Override
    public Register queryRegisterByid(String id) {
        String sql = "select id,password from register_table where id = ?";
        //返回一个注册者对象
        return queryForOne(Register.class,sql,id);
    }
    //按id和password查询
    @Override
    public Register queryRegisterByidAndPassword(String id, String password) {
        String sql = "select id,password from register_table where id = ? and password = ?";
        //返回一个查询到的对象
        return queryForOne(Register.class, sql, id,password);
    }
    //注册成功后，保存注册者信息
    @Override
    public int saveRegister(Register register) {
        //把用户密码加密后传入数据库
        String sql = "insert into register_table(id,password) values(?,?)";
        return update(sql,register.getID(),register.getPassword());
    }


    @Override
    public Long queryAllUserNum() {
        String sql = "select count(*) from register_table";
        return queryNum(sql);
    }

}

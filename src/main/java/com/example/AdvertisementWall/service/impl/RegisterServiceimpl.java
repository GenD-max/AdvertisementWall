package com.example.AdvertisementWall.service.impl;

import com.example.AdvertisementWall.dao.RegisterDao;
import com.example.AdvertisementWall.dao.impl.RegisterDaoimpl;
import com.example.AdvertisementWall.pojo.Register;
import com.example.AdvertisementWall.service.RegisterService;

/**
 * @author Зөндөө
 * @create 2021-06-03 23:18
 */
public class RegisterServiceimpl implements RegisterService {
    //RegisterDao用来操作数据库
    private RegisterDao registerDao = new RegisterDaoimpl();
    @Override
    public void registRegister(Register register) {
        registerDao.saveRegister(register);
    }

    @Override
    public Register login(Register register) {
        return registerDao.queryRegisterByidAndPassword(register.getID(),register.getPassword());
    }

    @Override
    public boolean existsId(String id) {
        if(registerDao.queryRegisterByid(id) == null){
            //未查找到就返回false
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Long queryRegisterNum() {
        return registerDao.queryAllUserNum();
    }
}

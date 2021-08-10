package com.example.AdvertisementWall.dao;

import com.example.AdvertisementWall.pojo.Register;

/*这里编写业务需要的CRUD接口*/
public interface RegisterDao {


    /**
     * 根据用户名查询用户信息
     * @param id 用户名
     * @return 如果返回null,说明没有这个用户。反之亦然
     */
    public Register queryRegisterByid(String id);

    /**
     * 根据 用户名和密码查询用户信息
     * @param id
     * @param password
     * @return 如果返回null,说明用户名或密码错误,反之亦然
     */
    public Register queryRegisterByidAndPassword(String id,String password);

    /**
     * 保存用户信息
     *  @param register
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int saveRegister(Register register);
    /**
     * 查询所有用户数量
     * @return
     */
    public Long queryAllUserNum();

}

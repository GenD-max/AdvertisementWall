package com.example.AdvertisementWall.dao.impl;

import com.example.AdvertisementWall.dao.AdvertisementDao;
import com.example.AdvertisementWall.pojo.Advertisement;

import java.util.List;

/**
 * @author kty
 * @date 2021/6/6 -20:37
 **/
public class AdvertisementDaoimpl extends BaseDao implements AdvertisementDao {

    @Override
    public int addOneAdvertisement(Advertisement advertisement) {
        String id = advertisement.getId();
        String content = advertisement.getContent();
        String pictureName = advertisement.getPictureName();
        String serialNumber = advertisement.getSerialNumber();
        String sql = "insert into guanggao_table(id, content, pictureName, serialNumber) values (?,?,?,?) ";
        return update(sql, id, content, pictureName, serialNumber);
    }

    @Override
    public int deleteAdByIdAndserialNumber(String id, String serialNumber) {
        String sql = "delete from guanggao_table where id = ? and serialNumber = ?";
        return update(sql, id,serialNumber);
    }

    @Override
    public int updateAdContentById(Advertisement advertisement) {
        String id = advertisement.getId();
        String content = advertisement.getContent();
        String pictureName = advertisement.getPictureName();
        String serialNumber = advertisement.getSerialNumber();
        String sql = "update guanggao_table set content = ?,pictureName = ? where id = ? and serialNumber = ?";
        return update(sql,content,pictureName,id,serialNumber);
    }

    @Override
    public List<Advertisement> queryAllAdvertisement() {
        String sql = "SELECT * FROM guanggao_table ORDER BY rand() ";
        return queryForList(Advertisement.class,sql);
    }

    @Override
    public Advertisement queryAdvertisementByserialNumber(String serialNumber) {

        String sql = "select * from guanggao_table where serialNumber = ?";
        //返回一个广告对象
        return queryForOne(Advertisement.class,sql,serialNumber);
    }

    @Override
    public Long queryAllAdvertisementsCount() {
        String sql = "select count(*) from guanggao_table";
        return queryNum(sql);
    }

    @Override
    public List<Advertisement> queryAdvertisementById(String id) {
        String sql = "SELECT * FROM guanggao_table where id = ?";
        return queryForList(Advertisement.class,sql,id);
    }
}

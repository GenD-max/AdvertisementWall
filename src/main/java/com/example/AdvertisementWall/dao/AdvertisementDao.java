package com.example.AdvertisementWall.dao;

import com.example.AdvertisementWall.pojo.Advertisement;

import java.util.List;

/**
 * @author kty
 * @date 2021/6/6 -20:32
 **/
public interface AdvertisementDao {

    /**
     * 插入一条广告
     */
    public int addOneAdvertisement(Advertisement advertisement);


    /**
     * 根据广告编号删除一条广告
     * @return
     */
    public int deleteAdByIdAndserialNumber(String id, String serialNumber);

    /**
     * 更新广告的内容
     * @param
     * @return
     */
    public int updateAdContentById(Advertisement advertisement);
    /**
     * 查询所有广告数量
     * @return
     */
    public Long queryAllAdvertisementsCount();

    /**
     * 查询所有广告
     * @return
     */
    public List<Advertisement> queryAllAdvertisement();

    /**
     * 按广告编号查询某个广告
     * @return
     */
    public Advertisement queryAdvertisementByserialNumber(String serialNumber);

    /**
     * 按用户询广告
     * @return
     */
    public List<Advertisement> queryAdvertisementById(String id);
}

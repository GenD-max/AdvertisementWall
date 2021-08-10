package com.example.AdvertisementWall.service;

import com.example.AdvertisementWall.pojo.Advertisement;

import java.util.List;

/**
 * @author Зөндөө
 * @create 2021-06-08 13:01
 */
public interface AdvertisementService {

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
     public Long queryAllADCount();

     /**
      * 查询所有广告
      * @return
      */
     public List<Advertisement> queryAllAD();

     /**
      * 按广告编号查询某个广告
      * @return
      */
     public Advertisement queryADoneByserialNumber(String serialNumber);

     /**
      * 按用户Id查询广告
      * @return
      */
     public List<Advertisement> queryADById(String id);
}

package com.example.AdvertisementWall.test;

import com.example.AdvertisementWall.pojo.Advertisement;
import com.example.AdvertisementWall.service.impl.AdvertisementServiceimpl;


/**
 * @author Зөндөө
 * @create 2021-06-08 13:12
 */
public class AdvertiseServiceTest {
    public static void main(String[] args) {
        Advertisement ad = new Advertisement("lyy666","测试本文008","2.jpg","lyy000AD001");
        AdvertisementServiceimpl as = new AdvertisementServiceimpl() ;
        as.updateAdContentById(ad);
    }
}

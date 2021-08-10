package com.example.AdvertisementWall.service.impl;

import com.example.AdvertisementWall.dao.impl.AdvertisementDaoimpl;
import com.example.AdvertisementWall.pojo.Advertisement;
import com.example.AdvertisementWall.service.AdvertisementService;

import java.util.List;

/**
 * @author Зөндөө
 * @create 2021-06-08 13:07
 */
public class AdvertisementServiceimpl implements AdvertisementService {
    @Override
    public int addOneAdvertisement(Advertisement advertisement) {
        return adi.addOneAdvertisement(advertisement);
    }

    @Override
    public int deleteAdByIdAndserialNumber(String id, String serialNumber) {
        return adi.deleteAdByIdAndserialNumber(id, serialNumber);
    }

    @Override
    public int updateAdContentById(Advertisement advertisement) {
        return adi.updateAdContentById(advertisement);
    }

    private AdvertisementDaoimpl adi = new AdvertisementDaoimpl();
    @Override
    public Long queryAllADCount() {
        return adi.queryAllAdvertisementsCount();
    }

    @Override
    public List<Advertisement> queryAllAD() {
        return adi.queryAllAdvertisement();
    }

    @Override
    public Advertisement queryADoneByserialNumber(String serialNumber) {
        return adi.queryAdvertisementByserialNumber(serialNumber);
    }

    @Override
    public List<Advertisement> queryADById(String id) {
        return adi.queryAdvertisementById(id);
    }
}

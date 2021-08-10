package com.example.AdvertisementWall.pojo;

/**
 * @author Зөндөө
 * @create 2021-06-08 14:41
 */
public class Advertisement {
    private String id;
    private String content;
    private String pictureName = "static/img/1.jpg";
    private String serialNumber;


    public Advertisement() {
    }

    public Advertisement(String id, String content, String pictureName, String serialNumber) {
        this.id = id;
        this.content = content;
        this.pictureName = pictureName;
        if(serialNumber != null && !"".equals(serialNumber)){
            this.serialNumber = serialNumber;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        if(serialNumber != null && !"".equals(serialNumber)){
            this.serialNumber = serialNumber;
        }
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", pictureName='" + pictureName + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

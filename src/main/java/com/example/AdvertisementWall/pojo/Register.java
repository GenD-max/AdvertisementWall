package com.example.AdvertisementWall.pojo;
public class Register {
   private String id;
   private String password;
   public void setID(String id){
      this.id = id;
   }
   public void setPassword(String password){
      this.password = password;
   }
   public String getID() {
      return id;
   }
   public String getPassword(){
      return password;
   }

   @Override
   public String toString() {
      return "Register{" +
              "id='" + id + '\'' +
              ", password='" + password + '\'' +
              '}';
   }

   public Register() {
   }

   public Register(String id, String password) {
      this.id = id;
      this.password = password;
   }
}

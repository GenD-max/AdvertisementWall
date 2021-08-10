package com.example.AdvertisementWall.test;
import com.example.AdvertisementWall.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Зөндөө
 * @create 2021-06-03 20:52
 */
public class JdbcUtilsTest {
    public static void main(String[] args) {
        try {
            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {

        }
    }
}

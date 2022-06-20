package com.aiminding.study.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取连接 url, 用户名， 密码
        //"jdbc:mysql://localhost:3306/Customer_?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String DATABASE = "Customer_";
        String USER = "root";
        String PASSWORD = "root";
        String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        Connection con = DriverManager.getConnection(url,USER,PASSWORD);
        System.out.println(con);
    }
}

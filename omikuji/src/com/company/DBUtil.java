package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getConnection() {
        String server = "localhost"; //MySQL 서버주소 サーバーのアドレス
        String database = "omikuji"; //MySQL DB명　サーバーの名
        String user_name = "root"; //MySQL 서버ID　サーバーのID
        String password = "1005"; //MySQL 서버PW　サーバーのPW

        Connection conn = null;


        try {
            //No suitable driverエラーのために追加
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database, user_name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}

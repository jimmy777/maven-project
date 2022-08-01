package com.abc;

import java.sql.*;

public class HelloMysql {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://rm-uf6lgkv4fd9776rxego.mysql.rds.aliyuncs.com:3306/study", "root", "whmilyY123!");
        System.out.println(connection);

        Statement st = connection.createStatement();

        ResultSet resultSet = st.executeQuery("select 1");

        while (resultSet.next())
        {
            System.out.println(resultSet.toString());
        }

        resultSet.close();
        st.close();
        connection.close();
    }
}

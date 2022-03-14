package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql {
    public static void main(String[] args)throws Exception{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linker", "root", "6390707");
        Statement statement = connection.createStatement();
        statement.executeUpdate("update linker set age = 36 where name = '黄雨竹'");
        ResultSet resultSet = statement.executeQuery("select * from linker");
        String name;
        String sex;
        int age;
        String liker;
        while (resultSet.next()){
            name = resultSet.getString("name");
            sex = resultSet.getString("sex");
            age = resultSet.getInt("age");
            liker = resultSet.getString("liker");
            System.out.println(name+"    "+sex+"    "+age+"    "+liker);
        }
    }
}

package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
    Connection connection;
    Statement statement;
    String name;
    String sex;
    int age;
    String liker;

    MySQL() {

    }

    MySQL(String url, String user, String password) throws Exception {
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }

    public void select(String sql) throws Exception {
        statement.executeQuery(sql);
        show(statement);
    }

    public void update(String sql) throws Exception {
        statement.execute(sql);
    }

    public void insert(String sql) throws Exception {
        statement.executeUpdate(sql);
    }

    public void delete(String sql) throws Exception {
        statement.execute(sql);
    }

    public void show(Statement statement) throws Exception {
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            name = resultSet.getString("name");
            sex = resultSet.getString("sex");
            age = resultSet.getInt("age");
            liker = resultSet.getString("liker");
            System.out.println(name + "    " + sex + "    " + age + "    " + liker);
        }
    }
}

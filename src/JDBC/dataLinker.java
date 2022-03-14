package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class dataLinker {
    Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;

    dataLinker() {

    }

    dataLinker(String url, String username, String password) throws Exception {
        connection = DriverManager.getConnection(url, username, password);
    }

    public Statement createStatement() throws Exception{
        statement = connection.createStatement();
        return statement;
    }
    public PreparedStatement createPreparedStatement(String sql)throws Exception{
        preparedStatement = connection.prepareStatement(sql);
        return preparedStatement;
    }
}

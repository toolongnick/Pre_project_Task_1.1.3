package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static Connection connection;

    static
    {
        String url = "jdbc:mysql://localhost:3306/sergeytdb";
        String userName = "root";
        String password = "Z,elepyfnml;fded41";
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}

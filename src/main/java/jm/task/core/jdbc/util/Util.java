package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url = "jdbc:mysql://localhost:3306/MySql?useSSL=false&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "root";

    public static Connection createConnection() {
        Connection connection = null;

        {
            try {
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static SessionFactory getSessionFactory() {
        return null;
    }

    public void closeConnection () {

    }
}
package org.mysqlcondatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    private static final String URL = "jdbc:mysql://localhost:3306/groups";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootroot";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено.");

        } catch (SQLException ex) {
            System.out.println("Не удалось установить подключение.");
        }
    }
}

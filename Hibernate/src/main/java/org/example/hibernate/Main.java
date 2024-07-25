package org.example.hibernate;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "spring", "spring");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employee");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("email"));
        }
    }
}

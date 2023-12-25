package ru.dolgosheev.jdbctest;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres");

        Statement statement = connection.createStatement();

//        executeInsert("'Kira'", "'Plastinina'", 24, "'+79993334455'", "'Saint-Petersburg'");
//        executeInsert("'Pasha'", "'Artemyev'", 35, "'+79884444455'", "'Moscow'");

//        ResultSet resultSet = statement.executeQuery("select* from dolgosheev.persons");
//
//        while (resultSet.next()) {
//            System.out.print(resultSet.getString(1) + " ");
//            System.out.print(resultSet.getString(2) + " ");
//            System.out.print(resultSet.getInt(3) + " ");
//            System.out.print(resultSet.getString(4) + "\n");
//        }

        CallableStatement callableStatement = connection.prepareCall("select gen_random_uuid ()");

        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        statement.close();
        connection.close();
    }

    private static void executeInsert(String name, String surname, int age, String phoneNumber, String city) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres");
        Statement statement = connection.createStatement();
        String sqlQuery = String.format("insert into dolgosheev.persons (name, surname, age, phone_number, city_of_living) "
                + "values(%s, %s, %d, %s, %s)", name, surname, age, phoneNumber, city);
        System.out.println(sqlQuery);
        statement.execute(sqlQuery);
    }
}

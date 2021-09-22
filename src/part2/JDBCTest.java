package part2;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCTest {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/information_schema", "root", "medibox@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from FILES");
            while (resultSet.next()) {
                System.out.println(resultSet.getLong(1) + "\t\t\t" + resultSet.getString(2) + "\t\t\t" + resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("\n closed");
        }

    }

}

package part2;

import org.postgresql.Driver;

import java.sql.*;

public class PostgreSQLTest {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/test", "postgres", "medibox@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from information.students;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("\n closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("\n closed");
        }

    }

}

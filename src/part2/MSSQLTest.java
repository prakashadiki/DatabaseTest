package part2;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.*;

public class MSSQLTest {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        try {
            DriverManager.registerDriver(new SQLServerDriver());
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=master", "sa", "medibox@123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from spt_values");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
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

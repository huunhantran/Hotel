package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection c = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HotelDB;encrypt=false",
                    "sa",
                    "123"
            );

            if (c == null) {
                throw new RuntimeException("Không kết nối được DB");
            }

            return c;

        } catch (Exception e) {
            throw new RuntimeException("Lỗi DB: " + e.getMessage());
        }
    }
}
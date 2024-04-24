package in.usermanagement.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class userDao1 {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/demo3";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "Rays@123";

    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
            System.out.println("Connected to database: " + conn.getCatalog());
            
            if (conn != null) {
                System.out.println("Connection successful!");
                // You can perform further operations with the connection here
            } else {
                System.out.println("Failed to establish connection!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Failed to load MySQL JDBC driver");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to establish database connection: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}

package in.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
//	public String url = "jdbc:mysql://localhost:3306/demo3";
//	public String username = "root";
//	public String password = "Rays@123";
//	
//	public Connection getConnection() throws Exception{
////		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = null;
//		try {
////			String url = "jdbc:mysql://localhost:3306/";
////			String username = "root";
////			String password = "Rays@123";
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection(url, username, password);
////			con.close();
//			System.out.println("connection");
//		
//			
//		} catch (ClassNotFoundException e) {
//	        e.printStackTrace();
//	        throw new SQLException("Failed to load MySQL JDBC driver");
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	        throw new SQLException("Failed to establish database connection: " + e.getMessage());
//	    }
//		System.out.println(con);
//		return con;
//	}
	
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/demo3";
        String jdbcUsername = "root";
        String jdbcPassword = "Rays@123";

        try {
            // Step 1: Establishing a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
            
            if (connection != null) {
                System.out.println("Connection successful!");
                
                // Step 2: Executing a test query
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT 1");
                
                // Step 3: Handling the result
                if (resultSet.next()) {
                    System.out.println("Test query executed successfully!");
                } else {
                    System.out.println("Test query did not return any results!");
                }
                
                // Close resources
                resultSet.close();
                statement.close();
                connection.close();
            } else {
                System.out.println("Failed to establish connection!");
            }
        } catch (SQLException e) {
            System.err.println("Connection failed! Error message: " + e.getMessage());
        }
	}

}

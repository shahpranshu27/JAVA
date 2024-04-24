//package in.usermanagement.dao;
//
//
///* This DAO class provides CRUD database operations for table users in database */
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.eclipse.jdt.internal.compiler.ast.ThisReference;
//
//import in.usermanagement.model.User;
//
////public class UserDAO {
//////	private String jdbcUrl = "jdbc:mysql://localhost:3306/demo3";
//////	private String jdbcUsername = "root";
//////	private String jdbcPassword = "Rays@123";
////	
////	private static final String INSERT_USERS_SQL = "insert into users (name, email, country) values (?, ?, ?);";
////	
////	private static final String SELECT_USERS_BY_ID = "select id, name, email, country from users where id=?"; 
////	
////	private static final String SELECT_ALL_USER = "select * from users";
////	
////	private static final String DELETE_USERS_SQL = "delete from users where id = ?";
////	
////	private static final String UPDATE_USERS_SQL = "update users set name=?, email=?, country=? where id=?";
////	
////	public UserDAO() {}
////	
//////	public Connection getConnection(){
//////		Connection conn = null;
//////		
//////		try {
//////			Class.forName("com.mysql.cj.jdbc.Driver");
//////			conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
//////		} catch (SQLException e) {
//////			e.printStackTrace();
//////		}
//////		catch (ClassNotFoundException e) {
//////			e.printStackTrace();
//////		}
//////		System.out.println(conn);
//////		return conn;
//////	}
////	public Connection getConnection() throws SQLException {
////	    Connection conn = null;
////	    
////	    try {
////	        Class.forName("com.mysql.cj.jdbc.Driver");
////	        conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
////	        System.out.println("Connected to database: " + conn.getCatalog());
////	    } catch (ClassNotFoundException e) {
////	        e.printStackTrace();
////	        throw new SQLException("Failed to load MySQL JDBC driver");
////	    } catch (SQLException e) {
////	        e.printStackTrace();
////	        throw new SQLException("Failed to establish database connection: " + e.getMessage());
////	    }
////	    
////	    return conn;
////	    
////	}
////
////	public void insertUser(User user) throws SQLException{
////		System.out.println(INSERT_USERS_SQL);
////		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(INSERT_USERS_SQL)) {
////			ps.setString(1, user.getName());
////			ps.setString(2, user.getEmail());
////			ps.setString(3, user.getCountry());
////			System.out.println(ps);
////			ps.executeUpdate();
////		} catch (SQLException e) {
////			printSQLException(e);
//////			e.printStackTrace();
////		}
////	}
////	
////	public User selectUser(int id) {
////		User user = null;
////		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(SELECT_USERS_BY_ID)) {
////			ps.setInt(1, id);
////			System.out.println(ps);
////			ResultSet rs = ps.executeQuery();
////			while (rs.next()) {
////				String name = rs.getString("name");
////				String email = rs.getString("email");
////				String country = rs.getString("country");
////				user = new User(name, email, country);
////			}
////		} catch (SQLException e) {
////			printSQLException(e);
//////			e.printStackTrace();
////		}
////		return user;
////	}
////	
////	public List <User> selectAllUsers(){
////		List <User> users = new ArrayList<>();
////		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(SELECT_ALL_USER)) {
////			System.out.println(ps);
////			ResultSet rs = ps.executeQuery();
////			while (rs.next()) {
////				int id = rs.getInt("id");
////				String name = rs.getString("name");
////				String email = rs.getString("email");
////				String country = rs.getString("country");
////				users.add(new User(id, name, email, country));
//////				(name, email, country);
////			}
////		} catch (SQLException e) {
//////			e.printStackTrace();
////			printSQLException(e);
////		}
////		return users;
////	}
////	
////	public boolean deleteUser(int id) throws SQLException {
////		boolean rowDeleted;
////		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(DELETE_USERS_SQL)) {
////			ps.setInt(1, id);
////			rowDeleted = ps.executeUpdate()>0;
////		}
////		return rowDeleted;
////	}
////	
////	public boolean updateUser(User user) throws SQLException{
////		boolean rowUpdated;
////		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(UPDATE_USERS_SQL)) {
////			ps.setString(1, user.getName());
////			ps.setString(2, user.getEmail());
////			ps.setString(3, user.getCountry());
////			ps.setInt(4, user.getId());
////			
////			rowUpdated = ps.executeUpdate()>0; 
////		}
////		return rowUpdated;
////	}
////	
////	private void printSQLException(SQLException ex) {
////		for(Throwable e: ex) {
////			if(e instanceof SQLException) {
////				e.printStackTrace(System.err);
////				System.err.println("SQLState: "+((SQLException)e).getSQLState());
////				System.err.println("Error code: "+((SQLException)e).getErrorCode());
////				System.err.println("Message: "+((e.getMessage())));
////				Throwable t = ex.getCause();
////				while (t!=null) {
////					System.out.println("Cause: "+t);		
////					t = t.getCause();
////				}
////			}
////		}
////	}}
//	
//	public static void main(String[] args) throws SQLException {
//		private String jdbcUrl = "jdbc:mysql://localhost:3306/demo3";
//		private String jdbcUsername = "root";
//		private String jdbcPassword = "Rays@123";
//		Connection conn = null;
//	    
//	    try {
//	        Class.forName("com.mysql.cj.jdbc.Driver");
//	        conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
//	        System.out.println("Connected to database: " + conn.getCatalog());
//	    } catch (ClassNotFoundException e) {
//	        e.printStackTrace();
//	        throw new SQLException("Failed to load MySQL JDBC driver");
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	        throw new SQLException("Failed to establish database connection: " + e.getMessage());
//	    }
//	    
//	    return conn;
//		
//		
//		if (connection != null) {
//            System.out.println("Connection successful!");
//            
//	}
//}
//

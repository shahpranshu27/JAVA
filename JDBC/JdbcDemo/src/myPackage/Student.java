package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	public void createDatabase() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "Rays@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement stm = con.createStatement();
			
			String query = "create database demo2";
			stm.execute(query);
			System.out.println("connection successful and database created succesfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/demo2";
			String username = "root";
			String password = "Rays@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			Statement stm = con.createStatement();
			
			String query = "create table student (s_id int, s_name varchar(20), s_email varchar(100))";
			stm.execute(query);
			System.out.println("connection successful and table created succesfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "demo2";
			String username = "root";
			String password = "Rays@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url+db, username, password);
			
//			Statement stm = con.createStatement();
			
//			String query = "insert into student values (1, 'pranshu', 'pranshu@gmail.com')";
//			stm.execute(query);
			PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
			ps.setInt(1, 2);			
			ps.setString(2, "tathya");
			ps.setString(3, "tathya@gmail.com");
			
			ps.execute();
			System.out.println("data inserted into the table successfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "demo2";
			String username = "root";
			String password = "Rays@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url+db, username, password);
			
//			String query = "select * from student";
//			Statement st = con.createStatement();
//			st.execute(query);
			
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				System.out.println(id);
				
				String name = rs.getString("s_name");
				System.out.println(name);
				
				String email = rs.getString("s_email"); 
				System.out.println(email);
			}
			System.out.println("data read successfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "demo2";
			String username = "root";
			String password = "Rays@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url+db, username, password);
			
			PreparedStatement ps = con.prepareStatement("update student set s_id=? where s_name=?");
			ps.setInt(1, 3);
			ps.setString(2, "tathya");
			
			ps.execute();
			
			System.out.println("data updated successfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "demo2";
			String username = "root";
			String password = "Rays@123";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url+db, username, password);
			
			PreparedStatement ps = con.prepareStatement("delete from student where s_name=?");
			ps.setString(1, "tathya");
			
			ps.execute();
			
			System.out.println("data deleted successfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package in.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
	
	private Connection connection;
	private Scanner scanner;
	
	public User(Connection connection, Scanner scanner) {
		this.connection = connection;
		this.scanner = scanner;
	}

	public void register() {
		System.out.println();
		System.out.print("Enter full name : ");
		String full_name = scanner.next();
		System.out.println();
		System.out.print("Enter email : ");
		String email = scanner.next();
		System.out.println();
		System.out.print("Enter password : ");
		String password = scanner.next();
		
		if(user_exist(email)) {
			System.out.println("User already exists!! Please login!");
			System.out.println();
			return;
		}
		String register_query = "insert into user(full_name, email, password) values(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(register_query);
			preparedStatement.setString(1, full_name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			int affected_rows = preparedStatement.executeUpdate();
			if(affected_rows>0) {
				System.out.println("Registration successfull!");
				System.out.println();
			}
			else {
				System.out.println("Registration failed!");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String login() {
		
		System.out.print("Enter email :");
		String email = scanner.next();
		System.out.println();
		System.out.print("Enter password : ");
		String password = scanner.next();
		
		String login_query = "select * from user where email=? and password=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(login_query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2,  password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println("Login successfull!");
				return email;
			}
			else {
				System.out.println("Login failed!");
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private boolean user_exist(String email) {
		String user_query = "select * from user where email=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(user_query);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}

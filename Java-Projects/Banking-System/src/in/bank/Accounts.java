package in.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Accounts {

	private Connection connection;
	private Scanner scanner;
	
	public Accounts(Connection connection, Scanner scanner) {
		this.scanner = scanner;
		this.connection = connection;
	}
	
	public long open_account(String email) {
		
		if(!account_exist(email)) {
			String query = "insert into accounts(account_number, full_name, email, balance, security_pin) values(?,?,?,?,?)";
			scanner.nextLine();
			System.out.println("Enter full name : ");
			String full_name = scanner.nextLine();
			System.out.println("Enter initial amount : ");
			double balance = scanner.nextDouble();
			System.out.println("Enter security pin : ");
			String security_pin = scanner.next();
			
			try {
				long account_number =generateAccountNumber();
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setLong(1, account_number);
				ps.setString(2, full_name);
				ps.setString(3, email);
				ps.setDouble(4, balance);
				ps.setString(5, security_pin);
				int rows_affected = ps.executeUpdate();
				if(rows_affected>0) {
					return account_number;
				}
				else {
					throw new RuntimeException("Account creation failed!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		throw new RuntimeException("Account already exists!");
	}
	
	public long getAccountNumber(String email) {
		
		String query = "select account_number from accounts where email=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				return resultSet.getLong("account_number");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("Account number doesn't exist!");
	}
	
	public long generateAccountNumber() {
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select account_number from accounts order by account_number desc limit 1");
			if(rs.next()) {
				long last_account_number = rs.getLong("account_number");
				return last_account_number+=1;
			}
			else {
				return 1000100;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1000100;
	}

	public boolean account_exist(String email) {
		String query = "select account_number from accounts where email=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
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

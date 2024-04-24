package in.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountsManager {

	private Connection connection;
	private Scanner scanner;
	
	public AccountsManager(Connection connection, Scanner scanner) {
		this.connection = connection;
		this.scanner = scanner;
	}
	
	public void credit_money(long account_number) throws SQLException {
		scanner.nextLine();
		System.out.println("Enter amount : ");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter security pin : ");
		String security_pin = scanner.nextLine();
		
		try {
			connection.setAutoCommit(false);
			if(account_number!=0) {
				PreparedStatement ps = connection.prepareStatement("select * from accounts where account_number=? and security_pin=?");
				ps.setDouble(1, account_number);
				ps.setString(2, security_pin);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					String credit_query = "update accounts set balance=balance+? where account_number=?";
					PreparedStatement ps1 = connection.prepareStatement(credit_query);
					ps1.setDouble(1, amount);
					ps1.setLong(2, account_number);
					int rows=ps1.executeUpdate();
					if(rows>0) {
						System.out.println("Rs. "+amount+" credited successfully!");
						connection.commit();
						connection.setAutoCommit(true);
					}
					else {
						System.out.println("Transaction failed!");
						connection.rollback();
						connection.setAutoCommit(true);
					}
				}
				else {
					System.out.println("Invalid security pin!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connection.setAutoCommit(true);
	}
	
	public void debit_money(long account_number) throws SQLException {
		scanner.nextLine();
		System.out.println("Enter amount : ");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter security pin : ");
		String security_pin = scanner.nextLine();
		
		try {
			connection.setAutoCommit(false);
			if(account_number!=0) {
				PreparedStatement ps = connection.prepareStatement("select * from accounts where account_number=? and security_pin=?");
				ps.setDouble(1, account_number);
				ps.setString(2, security_pin);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					double current_balance = rs.getDouble("balance");
					if(amount<=current_balance) {
						String debit_query = "update accounts set balance=balance-? where account_number=?";
						PreparedStatement ps1 = connection.prepareStatement(debit_query);
						ps1.setDouble(1, amount);
						ps1.setLong(2, account_number);
						int rows=ps1.executeUpdate();
						if(rows>0) {
							System.out.println("Rs. "+amount+" debited successfully!");
							connection.commit();
							connection.setAutoCommit(true);
						}
						else {
							System.out.println("Transaction failed!");
							connection.rollback();
							connection.setAutoCommit(true);
						}
					}
					else {
						System.out.println("Insufficient balance!");
					}
				}
				else {
					System.out.println("Invalid pin!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		connection.setAutoCommit(true);
	}
	
	public void transfer_money(long sender_account_number) throws SQLException {
		scanner.nextLine();
		System.out.println("Enter the account number of reciever : ");
		long receiver_account_number = scanner.nextLong();
		System.out.println("Enter amount you want to transfer : ");
		double amount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter security pin : ");
		String security_pin = scanner.next();
		
		try {
			connection.setAutoCommit(false);
			if (sender_account_number!=0 && receiver_account_number!=0) {
				PreparedStatement preparedStatement = connection.prepareStatement("select * from accounts where account_number=? and security_pin=?");
				preparedStatement.setLong(1, sender_account_number);
				preparedStatement.setString(2, security_pin);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					double current_balance = resultSet.getDouble("balance");
					if(current_balance>=amount) {
						String debit_query = "update accounts set balance=balance-? where account_number=?";
						String credit_query = "update accounts set balance=balance+? where account_number=?";
						
						PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);
						PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
						
						debitPreparedStatement.setDouble(1, amount);
						debitPreparedStatement.setLong(2, sender_account_number);
						
						creditPreparedStatement.setDouble(1, amount);
						creditPreparedStatement.setLong(2, receiver_account_number);
						
						
						int rowsAffected1 = debitPreparedStatement.executeUpdate();
						int rowsAffected2 = creditPreparedStatement.executeUpdate();
						
						if(rowsAffected1>0 && rowsAffected2>0) {
							System.out.println("Transaction successfull!");
							System.out.println("Rs. "+amount+" transferred successfully");
							connection.commit();
							connection.setAutoCommit(true);
						}
						else {
							System.out.println("Transfer failed!");
							connection.commit();
							connection.setAutoCommit(true);
						}
					}
					else {
						System.out.println("Insufficient balance!");
					}
				}
			} else {
				System.out.println("Invalid security pin! Check again");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getBalance(long account_number) {
		scanner.nextLine();
		System.out.println("Enter security pin : ");
		String security_pin = scanner.nextLine();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select balance from accounts where account_number=? and security_pin=?");
			preparedStatement.setLong(1, account_number);
			preparedStatement.setString(2, security_pin);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				double balance = resultSet.getDouble("balance");
				System.out.println("Balance: "+balance);
			}
			else {
				System.out.println("Invalid pin");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

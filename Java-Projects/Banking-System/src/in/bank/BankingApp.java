package in.bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingApp {
	private static String url = "jdbc:mysql://localhost:3306/banking";
	private static String username = "root";
	private static String password = "Rays@123";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Scanner scanner = new Scanner(System.in);
			
			User user= new User(connection, scanner);
			Accounts accounts = new Accounts(connection, scanner);
			AccountsManager accountsManager= new AccountsManager(connection, scanner);
			
			String email;
			long account_number;
			
			while (true) {
				System.out.println("** Welcome to Banking System **");
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				
				System.out.println("Enter your choice : ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1: {
					user.register();
					break;
				}
				case 2 :{
					email = user.login();
					if(email!=null) {
						System.out.println();
						System.out.println("User logged in!");
						if(!accounts.account_exist(email)) {
							System.out.println();
							System.out.println("What do you want to do?");
							System.out.println("1. Open a bank account");
							System.out.println("2. Exit");
							if(scanner.nextInt() == 1) {
								account_number = accounts.open_account(email);
								System.out.println("Account creation successfull!");
								System.out.println("Your account number is : "+account_number);
							}
							else {
								break;
							}
						}
						
						account_number = accounts.getAccountNumber(email);
						int choice1 = 0;
						while(choice1!=5) {
							System.out.println();
							System.out.println("1. Credit money");
							System.out.println("2. Debit Money");
							System.out.println("3. Transfer Money");
							System.out.println("4. Check balance");
							System.out.println("5. Log out");
							System.out.println("Enter your choice : ");
							choice1 = scanner.nextInt();
							switch (choice1) {
							case 1:
								accountsManager.credit_money(account_number);
								break;
							case 2:
								accountsManager.debit_money(account_number);
								break;
							case 3:
								accountsManager.transfer_money(account_number);
								break;
							case 4:
								accountsManager.getBalance(account_number);
								break;
							case 5:
								System.out.println("Logging out!");
								return;
							default:
								System.out.println("Enter valid choice!");
								break;
							}
						}
					}
					else {
						System.out.println("Incorrect email id or password");
					}
				}
				case 3:
					System.out.println("Thanks for using our Banking System! Do visit us again :)");
					return;
				default:
					System.out.println("Enter valid choice!");
					break;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

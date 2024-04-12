package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo 
{
	public static void main(String[] args) throws Exception {
//		step 1 : loading driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("driver class loaded successfully"); // to check if driver class is loaded or not
		
//		step 2 : connection with database
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Rays@123");
//		System.out.println("success!!"); // to check if the connection is successful or not
		
//		String name1 = "radhika";
//		String email1 = "radhika@gmail.com";
//		String password1 = "radhika123";
//		String gender1 = "female";
//		String city1 = "chicago";
		
//		--------------user values--------------
//		String name1 = "tathya";
//		String email1 = "tathya@gmail.com";
//		String password1 = "tathya123";
//		String gender1 = "male";
//		String city1 = "nyc";
		
//		----------taking input from user--------
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		String email1 = sc.next();
		String password1 = sc.next();
		String gender1 = sc.next();
		String city1 = sc.next();
		sc.close();
		
//		step 3 : statement
//		PreparedStatement ps = con.prepareStatement("insert into register values ('pranshu', 'pranshu@gmail.com', 'abc123', 'male', 'boston')");
//		PreparedStatement ps = con.prepareStatement("insert into register values ('"+name1+"', '"+email1+"', '"+password1+"', '"+gender1+"', '"+city1+"')");
		PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?,?)"); // ? is used for positional parameters
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, password1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
//		step 4 : execute update
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		con.close();
	}
}

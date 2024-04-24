package in.sp.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Rays@123");
		
		String email1 = "siddh@gmail.com";
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		ps.setString(1, email1);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("deletion successful");
		}
		else {
			System.out.println("deletion failed");
		}
	}
}

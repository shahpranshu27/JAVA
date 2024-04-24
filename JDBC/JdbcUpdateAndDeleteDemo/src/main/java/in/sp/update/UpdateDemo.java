package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Rays@123");
		
		
		String city1 = "baltimore";
		String email1 = "siddh@gmail.com";
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?"); // column_name=? -> positional parameter
		ps.setString(1, city1);
		ps.setString(2, email1);
		
		int count = ps.executeUpdate();
		if(count>0) {
			System.out.println("updation success");
		}
		else {
			System.out.println("updation fail");
		}
		con.close();
	}
}

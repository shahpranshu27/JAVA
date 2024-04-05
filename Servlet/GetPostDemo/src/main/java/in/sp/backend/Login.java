package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String myName = request.getParameter("name1");
		String myPass = request.getParameter("password1");

//		System.out.println("name: "+myName);
//		System.out.println("password: "+myPass);
//		
//		PrintWriter out = response.getWriter();
//		out.println("name: "+myName);
//		out.println("password: "+myPass);

//		if the method is "post", we can use doPost() method, and if the method is "get", then we can use doGet() method. this is used for specific methods, 
//		otherwise service() method accepts both

		if (myName.equals("as") && myPass.equals("1234")) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
	}
}

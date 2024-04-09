package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/submitForm")
public class MyServlet1 extends HttpServlet
{
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		we get the values from the client through request, and it gets printed by response
		String myName = request.getParameter("name1");
		String myEmail = request.getParameter("email1");
		
//		this gets printed on console
		System.out.println("name: "+myName);
		System.out.println("email: "+myEmail);
		
//		this gets printed on browser
		PrintWriter out = response.getWriter();
		out.println("Name: "+myName);
		out.println("Email: "+myEmail);
	}
}

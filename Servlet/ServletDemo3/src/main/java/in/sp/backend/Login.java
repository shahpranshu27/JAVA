package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myEmail = request.getParameter("email1");
		String myPass =  request.getParameter("pass1");
		
		PrintWriter out = response.getWriter();
		
		if(myEmail.equals("abc@gmail.com") && myPass.equals("1234")) {
//			String myName = "Pranshu";
//			request.setAttribute("name_key", myName);
//			request.setAttribute("name_key", "Pranshu Shah");
			
			HttpSession session = request.getSession();
			session.setAttribute("name_key", "Pranshu shah");
			String myGen = "male";
			session.setAttribute("gender", myGen);
			RequestDispatcher rd =  request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.println("<h3 style='color:red'>The email and password you entered are incorrect!</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
//			rd.forward(request, response);
			rd.include(request, response);
		}
	}
}

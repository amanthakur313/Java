package sp.in.br;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/submitform")
public class Sesseon extends HttpServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String myemail = request.getParameter("email");
		String mypass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		if(myemail.equals("amanthakur@gmail.com") &&(mypass.equals("123"))) {
//			request.setAttribute("name_key", "AMAN");
			HttpSession session = request.getSession();
			session.setAttribute("name_key","Aman");
			RequestDispatcher rd = request.getRequestDispatcher("/Profile.jsp");
			rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.print("<h3 style = 'color:red'> email and passward didnt matched </h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/Index.html");
			rd.include(request, response);
		}
	}

}

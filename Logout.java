package sp.in.br;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//import jakarta.servlet.http.ServletException;

@WebServlet("/Logout")
public class Logout extends HttpServlet{
protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException {
HttpSession session = request.getSession();
session.invalidate();

RequestDispatcher rd = request.getRequestDispatcher("/Index.html");
rd.forward(request, response);
	
	
	
}
}

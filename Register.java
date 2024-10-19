package mp.sp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitform")
public class Register extends HttpServlet{
protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	String myname = request.getParameter("name");
	String myemail = request.getParameter("email");
	String mypass = request.getParameter("pass");
	String mygen =request.getParameter("gender");
	String mycity = request.getParameter("city");
	PrintWriter out = response.getWriter();
try {
	Class.forName("com.mysql.jdbc.driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","AMANTHAKUR");
	PreparedStatement ps = con.prepareStatement("insert into registers values (?,?,?,?,?");
	ps.setString(1,myname);
	ps.setString(2, mycity);
	ps.setString(3,mypass);
	ps.setString(4, mygen);
	ps.setString(5, myemail);
	
	int count = ps.executeUpdate();
	if(count>0) {
		response.setContentType("text/html");
		out.println("<h3 style = 'color:green'> user registered successfuly</h3>");
		RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
		rd.forward(request,response);
	}
	else {
		response.setContentType("text/html");
		out.println("<h3 style = 'color :green'> user registration fail t</h3>");
		RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
		rd.forward(request, response);
	}
}
catch(Exception e) {
	out.println("error"+e.getMessage());
	response.setContentType("text/html");
	RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
	
rd.include(request, response);
}
	
}

}

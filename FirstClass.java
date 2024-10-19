package in.sp.bk;

import java.io.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class FirstClass extends HttpServlet{

	protected void doPost( HttpServletRequest Request ,HttpServletResponse response ) throws ServletException ,IOException {
String myemail = (String) Request.getParameter("name1");
String mypass = (String) Request.getParameter("pass1");
PrintWriter out = response.getWriter();
out.println(myemail);
out.println(mypass);
if(myemail.equals("deepak@gmail.com")&&mypass.equals("deepak123")) {
	System.out.println("success");
}
else {
	System.out.println("failed");	
}
	}

}









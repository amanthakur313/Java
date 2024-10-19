
package in.sp.bk;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class SearchOn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
       String myemail = request.getParameter("email");
       String mypass = request.getParameter("passward");
       String mypress = request.getParameter("press");
	   PrintWriter out = response.getWriter();
	  

       if(myemail.equals("aman@gmail.com")&& mypass.equals("aman123")) {
    	  
    	  
    	   RequestDispatcher rd  = request.getRequestDispatcher("/Profile.jsp");
    	   rd.forward(request, response);
       }
       
   
      else {
   RequestDispatcher rd = request.getRequestDispatcher("/NewFile.html");
   rd.forward(request, response);
      }
       
    }
}

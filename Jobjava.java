package in.co.job;





import java.io.IOException;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


@WebServlet("/submit")
public class Jobjava extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String resume = request.getParameter("resume");
        String coverLetter = request.getParameter("coverLetter");
        
        // Here, you can save the data to a database or process it as needed.
        
        // Redirect to success page
        request.setAttribute("name", name);
        request.setAttribute("email",email);
        request.setAttribute("phone",phone);
        request.setAttribute("resume", resume);
        request.setAttribute("coverLetter", coverLetter);
        
        request.getRequestDispatcher("Success.jsp").forward(request, response);
    }
}


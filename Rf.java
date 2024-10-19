package in.sp;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TypingTestServlet")
public class Rf extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String TEST_TEXT = "The quick brown fox jumps over the lazy dog.";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userInput = request.getParameter("userInput");

        // Determine if the input matches the test text
        boolean isCorrect = TEST_TEXT.equals(userInput);

        // Set response content type
        response.setContentType("text/html");

        // Generate response based on the correctness of the input
        response.getWriter().println("<html><head><title>Typing Test Result</title></head><body>");
        if (isCorrect) {
            response.getWriter().println("<h1>Typing Test Result</h1>");
            response.getWriter().println("<p>Correct! Well done!</p>");
        } else {
            response.getWriter().println("<h1>Typing Test Result</h1>");
            response.getWriter().println("<p>Incorrect. Please try again.</p>");
        }
        response.getWriter().println("<a href='index.jsp'>Back to Test</a>");
        response.getWriter().println("</body></html>");
    }
}

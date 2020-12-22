package by.tms.servlets.LessonOne;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet(urlPatterns = "/reverse")
public class Reverse extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        String string = req.getParameter("string").toLowerCase(Locale.ROOT).trim();
        ReverseString reverseString = new ReverseString();  // creating a new class ReverseString
        String stringRev = reverseString.reverse(string);  // new string, putting there new class + method reverse
        resp.getWriter().println("Original: " + string + "\n" + "Reverse: " + stringRev);

    }

}

// http://localhost:8080/reverse?string=something

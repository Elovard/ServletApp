package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = "/length")
public class LengthServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");

        if (user.getName() != null) {
            int length = user.getName().length();
            resp.getWriter().println("Your name is " + user.getName());
            resp.getWriter().println("It has " + length + " symbols.");
        } else {
            resp.getWriter().println("Your name is empty!");
        }
    }
}
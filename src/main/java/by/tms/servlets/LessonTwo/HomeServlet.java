package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Home.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        if (user != null) {
            req.setAttribute("messageHomeReg", "Welcome back!" + user.getName());
            // resp.getWriter().println("Welcome, " + user.getName() + "!");
        } else {
            req.setAttribute("messageHomeUnreg", "Hello, User!");
            // resp.getWriter().println("Hello Guest! You are not registered here.");
        }
    }
}

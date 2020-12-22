package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/account")
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       User user = (User) req.getSession().getAttribute("user");
       resp.getWriter().println("Your unique id: " + user.getId());
       resp.getWriter().println("Your login is: " + user.getLogin());
       resp.getWriter().println("Your name is: " + user.getName());
       resp.getWriter().println("Your password is: " + user.getPassword());
    }
}

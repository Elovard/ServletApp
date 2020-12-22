package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/auth")
public class AuthorizationServlet extends HttpServlet {

    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User byLogin = inMemoryUserStorage.getByLogin(login);
        if (byLogin != null) {
            if (byLogin.getPassword().equals(password)) {
                req.getSession().setAttribute("user", byLogin);  // success
                resp.getWriter().println("Welcome back, " + byLogin.getName() + "!");

            } else {
                resp.getWriter().println("Error! Wrong password!");
            }
        } else {
            resp.getWriter().println("Error! You are not registered here! (user is not found)");
        }
    }
}

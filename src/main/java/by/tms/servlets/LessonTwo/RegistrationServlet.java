package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/reg")
public class RegistrationServlet extends HttpServlet {

    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (name != null && login != null && password != null) {   // && - и, || - или
            if (login.length() >= 4) {
                if (password.length() >= 4) {
                    User user = new User(name, login, password);
                    inMemoryUserStorage.addUser(user);
                    resp.getWriter().println("Thank you for your registration! Enjoy!");
                } else {
                    resp.getWriter().println("Your password is too short! (min 4 symbols)");
                }
            } else {
                resp.getWriter().println("Your login is too short! (min 4 symbols)");
            }
        } else {
            resp.getWriter().println("Fields NAME, LOGIN and PASSWORD are must!");
        }
    }
}
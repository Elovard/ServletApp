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
        getServletContext().getRequestDispatcher("/AuthorizationServlet.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User byLogin = inMemoryUserStorage.getByLogin(login);

        if (byLogin != null) {
            if (byLogin.getPassword().equals(password)) {
                req.getSession().setAttribute("user", byLogin);
                req.setAttribute("messageHomeReg", "Welcome back, dear " + byLogin.getName());
                getServletContext().getRequestDispatcher("/Home.jsp").forward(req, resp);


            } else {
                req.setAttribute("messageWrongPassword", "Error! Wrong Password!");
                getServletContext().getRequestDispatcher("/AuthorizationServlet.jsp").forward(req, resp);
            }
        } else {
            req.setAttribute("messageNotRegistered", " Error! You are not registered here! (user is not found)");
            getServletContext().getRequestDispatcher("/AuthorizationServlet.jsp").forward(req, resp);
        }
    }
}


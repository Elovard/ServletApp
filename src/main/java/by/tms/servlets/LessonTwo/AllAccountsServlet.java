package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet (urlPatterns = "/all")
public class AllAccountsServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            InMemoryUserStorage.users.toArray();
            resp.getWriter().println("All the Users: " + "\n" + Arrays.toString(InMemoryUserStorage.users.toArray()));
//        } else {
//            resp.getWriter().println("Error! You have to be registered to do this!");
        }
    }
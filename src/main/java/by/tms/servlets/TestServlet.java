package by.tms.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class TestServlet extends HttpServlet {

        @Override
        public void init() throws ServletException {
            System.out.println("init");
        }

        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            super.service(req, resp);
            System.out.println("service");
        }

        @Override
        public void destroy() {
            System.out.println("destroy");
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
//            getServletContext().setAttribute("something", "Test"); // app scope; засетили аттрибут в этом методе
            // можно хранить инфу в app scope (сервлет контекст)
//            req.setAttribute("name", "Test"); // для отправки аттрибута другому сервлету
            System.out.println(req.getSession().getAttribute("name"));  // сохраняет для определенного клиента инфу


            String name = req.getParameter("name");
            String age = req.getParameter("age");


        }
    }


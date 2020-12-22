package by.tms.servlets.LessonOne;

import by.tms.servlets.LessonOne.Calculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;


@WebServlet(urlPatterns = "/calculator")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        int firstNum = Integer.parseInt(req.getParameter("firstNum"));
        int secondNum = Integer.parseInt(req.getParameter("secondNum"));
        String operation = req.getParameter("operation").toLowerCase(Locale.ROOT).trim();
        Calculator calculator = new Calculator();
        resp.getWriter().println(calculator.operation(firstNum, secondNum, operation));
    }
}

// http://localhost:8080/calculator?firstNum=10&secondNum=30&operation=sum



















//@WebServlet(urlPatterns = "/home")  // /home это наша обработка, наш servlet
//public class HomeServlet extends HttpServlet {
//    @Override
//    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
//        String name = req.getParameter("name");   // у реквеста получаем параметр name
//        String age = req.getParameter("age");
//        System.out.println(name); // http://localhost:8080/home?name=test2   - получаем данные из браузера (в консоль выведет test2)
//        System.out.println(name + " " + age); // http://localhost:8080/home?name=test2&age=22
//        // для получения параметров используем "?"; для нескольких переменных используем "&"
//        resp.getWriter().println(name + " " + age ); // для вывода непосредственно на экране (на странице)
//
//
//    }



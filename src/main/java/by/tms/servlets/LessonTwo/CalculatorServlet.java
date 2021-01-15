package by.tms.servlets.LessonTwo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/calc")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstNum = Integer.parseInt(req.getParameter("firstNum"));
        int secondNum = Integer.parseInt(req.getParameter("secondNum"));
        String operation = req.getParameter("operation");
        CalculatorInside calculatorInside = new CalculatorInside();
        calculatorInside.operation(firstNum, secondNum, operation);
        req.setAttribute("result", calculatorInside.result);
        req.getSession().setAttribute("result", operation);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Calculator.jsp").forward(req, resp);
        CalculatorInside calculatorInside = new CalculatorInside();
        String result = calculatorInside.result;
        req.setAttribute("result", result);


    }
}


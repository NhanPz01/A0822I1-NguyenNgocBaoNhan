package com.example.ss_10_calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double first = Double.parseDouble(request.getParameter("first_operand"));
        double second = Double.parseDouble(request.getParameter("second_operand"));
        char operator = request.getParameter("operators").charAt(0);
        String result = Calculator.calculate(first, second, operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/calculate.jsp").forward(request, response);
    }
}

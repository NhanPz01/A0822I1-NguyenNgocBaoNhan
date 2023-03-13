package com.example.ss_9;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculateDiscountServlet", value = "/display-discount")
public class CalculateDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double price = Double.parseDouble(request.getParameter("list_price"));
        double discount = Double.parseDouble(request.getParameter("discount_percent"));
        double discountAmount = price * discount * 0.01;
        double discountPrice = price - discountAmount;
        request.setAttribute("discount_price", discountPrice);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

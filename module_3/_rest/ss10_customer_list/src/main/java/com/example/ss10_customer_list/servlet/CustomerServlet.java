package com.example.ss10_customer_list.servlet;

import com.example.ss10_customer_list.model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    public static List<Customer> customers;

    @Override
    public void init() throws ServletException {
        super.init();
        customers = new ArrayList<>();
        customers.add(new Customer("1", "Nhan 01", "01/01/1000", "12 ABC", "https://clipground.com/images/img_avatar-png-2.png"));
        customers.add(new Customer("2", "Nhan 02", "02/01/1000", "14 ABC", "https://cdn1.vectorstock.com/i/1000x1000/23/70/man-avatar-icon-flat-vector-19152370.jpg"));
        customers.add(new Customer("3", "Nhan 03", "03/01/1000", "16 ABC", "https://www.netclipart.com/pp/m/135-1353105_img-avatar-2-png-illustration.png"));
        customers.add(new Customer("4", "Nhan 04", "04/01/1000", "18 ABC", "https://free.clipartof.com/855-Free-Clipart-Of-A-Male-Avatar.jpg"));
        customers.add(new Customer("5", "Nhan 05", "01/01/1000", "20 ABC", "https://i.pinimg.com/736x/8b/16/7a/8b167af653c2399dd93b952a48740620.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

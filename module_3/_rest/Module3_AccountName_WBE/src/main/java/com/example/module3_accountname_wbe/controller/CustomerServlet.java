package com.example.module3_accountname_wbe.controller;

import com.example.module3_accountname_wbe.model.Customer;
import com.example.module3_accountname_wbe.model.CustomerType;
import com.example.module3_accountname_wbe.repository.CustomerRepository;
import com.example.module3_accountname_wbe.repository.CustomerTypeRepository;
import com.example.module3_accountname_wbe.service.CustomerService;
import com.example.module3_accountname_wbe.service.CustomerServiceImpl;
import com.example.module3_accountname_wbe.service.CustomerTypeService;
import com.example.module3_accountname_wbe.service.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService;
    private CustomerTypeService customerTypeService;

    public void init() {
        customerService = new CustomerServiceImpl();
        customerTypeService = new CustomerTypeServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
//            case "create":
//                showNewForm(request, response);
//                break;
//            case "edit":
//                showEditForm(request, response);
//                break;
//            case "delete":
//                showDeleteForm(request, response);
//                break;
//            case "search":
//                searchNhanVien(request, response);
//                break;
            default:
                showCustomerHome(request, response);
                break;
        }
    }

    private void showCustomerHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = customerService.findAll();
        request.setAttribute("listCustomer", listCustomer);
        request.getRequestDispatcher("user/customer/customer_list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                inserCustomer(request, response);
//                break;
//            case "edit":
//                updateUser(request, response);
//                break;
//            case "delete":
//                deleteUser(request, response);
//                break;
        }
    }
}

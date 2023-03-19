package com.example.ss_11_product_manager.controller;

import com.example.ss_11_product_manager.bean.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class DetailServlet extends HttpServlet {
    public static List<Product> products;

    @Override
    public void init() throws ServletException {
        super.init();
        products = new ArrayList<>();
        products.add(new Product(1, "Desk"));
        products.add(new Product(2, "Table"));
        products.add(new Product(3, "Lamp"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sId = request.getParameter("id");
        if (sId != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            Product product = null;
            for (Product p : products) {
                if (p.getId() == id) {
                    product = p;
                }
            }
            request.setAttribute("product", product);
        }

        request.setAttribute("products", products);
        request.getRequestDispatcher("/product/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

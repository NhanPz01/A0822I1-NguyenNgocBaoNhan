package com.example.productmanagement.controller;

import com.example.productmanagement.model.Category;
import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.CategoryService;
import com.example.productmanagement.service.CategoryServiceImpl;
import com.example.productmanagement.service.ProductService;
import com.example.productmanagement.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService;
    private CategoryService categoryService;

    public void init() {
        productService = new ProductServiceImpl();
        categoryService = new CategoryServiceImpl();
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
            case "create":
                showNewForm(request, response);
                break;
//            case "edit":
//                showEditForm(request, response);
//                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("user/delete.jsp").forward(request, response);
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchName = request.getParameter("name");
//        Double searchPrice = Double.parseDouble(request.getParameter("price"));
//        String searchCategoryName = request.getParameter("category");
//        List<Product> listSearchByName = new ArrayList<>();
//        List<Product> listSearchByPrice = new ArrayList<>();
//        List<Product> listSearchByCategory = new ArrayList<>();
//        if (searchName != null) {
//            listSearchByName = productService.findByName(searchName);
//        }
//        if (searchPrice != 0) {
//            listSearchByPrice = productService.findByPrice(searchPrice);
//        }
//        if (searchCategoryName != null) {
//            listSearchByCategory = productService.findByName(searchCategoryName);
//        }
//
//        for (Product product : listSearchByName) {
//            listProduct.add(product);
//        }
//        for (Product product : listSearchByPrice) {
//            listProduct.add(product);
//        }
//        for (Product product : listSearchByCategory) {
//            listProduct.add(product);
//        }
        List<Product> listProduct = productService.findByName(searchName);
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("/user/list.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCategory", categoryService.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        dispatcher.forward(request, response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = productService.findAll();
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("user/list.jsp").forward(request, response);
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
            case "create":
                insertProduct(request, response);
                break;
//            case "edit":
//                updateUser(request, response);
//                break;
            case "delete":
                deleteProduct(request, response);
                break;
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.deleteById(id);
        response.sendRedirect("/product?isCreate=true");
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        int categoryId = Integer.parseInt(request.getParameter("category_id"));
        Category category = categoryService.findById(categoryId);

        Product product = new Product(name, price, quantity, color, category, description);
        productService.add(product);
        response.sendRedirect("/product?isCreate=true");
    }
}

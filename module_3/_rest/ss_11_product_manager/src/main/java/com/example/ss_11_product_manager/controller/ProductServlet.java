package com.example.ss_11_product_manager.controller;

import com.example.ss_11_product_manager.bean.Product;
import com.example.ss_11_product_manager.service.ProductService;
import com.example.ss_11_product_manager.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService service = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                showList(request, response);
                break;
            case "detail":
                showDetail(request, response);
                break;
            case "create":
                showCreate(request, response);
                break;
            case "edit":
                break;
            case "delete":
                showDelete(request, response);
                break;
            default:
                showError(request, response);
        }
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = service.findById(id);
        try {
            if (product == null) {
                request.getRequestDispatcher("product/error.jsp").forward(request, response);
            } else {
                request.setAttribute("product", product);
                request.getRequestDispatcher("product/delete.jsp").forward(request, response);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/product/error.jsp").forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/product/create.jsp").forward(request, response);
    }

    private void showDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("product", service.findById(id));
        request.getRequestDispatcher("/product/detail.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("products", service.findAll());
        request.getRequestDispatcher("/product/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            showError(request, response);
            return;
        }

        switch (action) {
            case "create":
                doCreate(request, response);
                break;
            case "edit":
                doUpdate(request, response);
                break;
            case "delete":
                doDeleteProduct(request, response);
                break;
            default:
                showError(request, response);
        }
    }

    private void doDeleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = service.findById(id);
        try {
            if (product == null) {
                request.getRequestDispatcher("product/error.jsp").forward(request, response);
            } else {
                service.delete(id);
                request.setAttribute("messageDelete", " Delete Successful");
                request.getRequestDispatcher("product/delete.jsp").forward(request, response);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Product product = new Product(id, name);
        service.update(product);
        response.sendRedirect("/product?action=edit&id=" + id);
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Product product = new Product(id, name);
        service.create(product);
        response.sendRedirect("/product?action=list");
    }
}

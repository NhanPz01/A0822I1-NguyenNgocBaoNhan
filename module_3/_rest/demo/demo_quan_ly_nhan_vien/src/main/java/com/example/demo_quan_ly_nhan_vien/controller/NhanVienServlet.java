package com.example.demo_quan_ly_nhan_vien.controller;

import com.example.demo_quan_ly_nhan_vien.model.NhanVien;
import com.example.demo_quan_ly_nhan_vien.service.impl.NhanVienService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "NhanVienServlet", value = "/nhan-vien")
public class NhanVienServlet extends HttpServlet {
    private NhanVienService nhanVienService;

    public void init() {
        nhanVienService = new NhanVienService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
//                case "edit":
//                    showEditForm(request, response);
//                    break;
//                case "delete":
//                    deleteNhanVien(request, response);
//                    break;
            default:
                listNhanVien(request, response);
                break;
        }
    }

    private void listNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NhanVien> listNhanVien = nhanVienService.findAll();
        request.setAttribute("listNhanVien", listNhanVien);
        request.getRequestDispatcher("user/list.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertUser(request, response);
                break;
//                case "edit":
//                    updateUser(request, response);
//                    break;
//                case "search":
//                    searchByCountry(request, response);
//                    break;
        }
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maNhanVien = request.getParameter("maNhanVien");
        String hoTen = request.getParameter("hoTen");
        String ngaySinh = request.getParameter("ngaySinh");
        String diaChi = request.getParameter("diaChi");
        String ngayBatDauLam = request.getParameter("ngayBatDauLam");
        String ngayKetThucLam = request.getParameter("ngayKetThucLam");
        double luong = Double.parseDouble(request.getParameter("luong"));
        String maCongViec = request.getParameter("maCongViec");
        NhanVien nhanVien = new NhanVien(maNhanVien, hoTen, ngaySinh, diaChi, ngayBatDauLam, ngayKetThucLam, luong, maCongViec);
        nhanVienService.add(nhanVien);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        dispatcher.forward(request, response);
    }
}

<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11-Apr-23
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,200;1,300;1,400;1,500;1,600;1,700;1,800&display=swap"
          rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>

    <link rel="stylesheet" href="../CSS/loginform.css">
</head>
<body>
<div class="login-form">
    <form class="abc mt-[250px] ml-[60%] gap-5 flex flex-col w-[30%]" th:action="@{/userLogin}" th:object="${user}"
          method="post">
        <input type="text" th:field="*{username}"
               class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
               placeholder="Tài khoản">
        <input type="password" th:field="*{password}"
               class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
               placeholder="Mật khẩu">
        <button type="submit"
                class="btn bg-[#4BA9FF] flex items-center justify-center w-full h-[55px] rounded-3xl text-white font-bold text-[20px] cursor-pointer shadow-md shadow-gray-300">
            Đăng nhập
        </button>
        <div class="border-[2px] h-0 w-full border-[#AAAAAA]"></div>
        <div class="w-full h-[55px] flex justify-between items-center">
            <p class="text-[#4BA9FF] text-[16px] font-semibold">Quên mật khẩu</p>
            <p class="bg-[#6AFF79] w-[205px] h-[55px] rounded-3xl flex justify-center items-center text-white text-[20px] font-bold shadow-md shadow-gray-300">
                Đăng kí</p>
        </div>
        <div class="text-red-500">
            <p>Tài khoản hoặc mật khẩu sai hoặc không tồn tại, vui lòng nhập lại</p>
        </div>
    </form>
</div>
<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
</body>
</html>

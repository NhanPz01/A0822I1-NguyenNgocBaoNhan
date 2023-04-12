<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11-Apr-23
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,200;1,300;1,400;1,500;1,600;1,700;1,800&display=swap"
          rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>

    <link rel="stylesheet" href="../CSS/profile.css">
</head>
<body>
<div class="header shadow-md shadow-gray-400 z-20 sticky top-0">
    <div class="absolute flex z-10 gap-2 top-5 right-10 flex-col items-end">
        <img src="../static/IMG/Rectangle 6.png" class="rounded-full w-[50px] h-[50px] profile-btn cursor-pointer">
        <div class="w-[250px] h-[350px] bg-white shadow-md flex-col justify-around profile-menu">
            <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center ">
                <iconify-icon icon="codicon:account"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Trang cá nhân</p>
            </div>
            <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center">
                <iconify-icon icon="material-symbols:manage-search"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Quản lý nội dung</p>
            </div>
            <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center">
                <iconify-icon icon="material-symbols:manage-history"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Lịch sử hoạt động</p>
            </div>
            <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center ">
                <iconify-icon icon="ep:setting"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Tùy chỉnh</p>
            </div>
            <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center">
                <iconify-icon icon="ri:logout-box-line"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Đăng xuất</p>
            </div>
        </div>
    </div>
    <div class="relative w-full h-[88px] bg-[#6EB6F9] pt-4">

        <div class="relative w-[60%] h-[50px] m-auto">
            <input class="w-full h-full bg-white rounded pl-10" placeholder="Tìm kiếm">
            <div class="absolute w-8 h-8 bg-[#6EB6F9] right-2 top-2 flex justify-center items-center rounded-md">
                <iconify-icon icon="ic:baseline-search" class="text-white"></iconify-icon>
            </div>
            </input>
        </div>

    </div>
</div>
<div class="user-section">
    <div class="user-ava w-full h-64 flex items-center pl-12 pr-12 justify-between">
        <div class="usercard flex gap-10">
            <img src="../static/IMG/Rectangle 6.png" class="rounded-full w-32 h-32">
            <div class="username">
                <p class="text-3xl text-black font-bold">Tên</p>
                <p class="text-xl text-gray-500 font-normal">@gmail.com</p>
            </div>
        </div>
        <a href="./profile-setting.html"
           class="edit-btn flex justify-center items-center w-32 h-12 border-[2px] bg-sky-400 text-2xl text-white font-normal rounded-2xl cursor-pointer">Sửa</a>
    </div>
    <div class="select-section border-t-2 border-b-2 flex gap-10 p-5 shadow-md">
        <a href="" class="select-item text-xl text-gray-500 font-normal">Bài viết</a>
        <a href="" class="select-item text-xl text-gray-500 font-normal">Câu hỏi</a>
        <a href="" class="select-item text-xl text-gray-500 font-normal">Câu trả lời</a>
        <a href="" class="select-item text-xl text-gray-500 font-normal">Bookmark</a>
        <a href="" class="select-item text-xl text-gray-500 font-normal">Liên hệ</a>
    </div>
</div>
<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/iconify-icon@1.0.7/dist/iconify-icon.min.js"></script>
<script language="javascript" src="../JS/profile.js"></script>
</body>
</html>

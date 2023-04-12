<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11-Apr-23
  Time: 2:20 PM
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

    <link rel="stylesheet" href="../CSS/profile-setting.css">
</head>
<body>
<div class="header shadow-md shadow-gray-400 z-20 sticky top-0">
    <div class="absolute flex z-10 gap-2 top-5 right-10 flex-col items-end">
        <img src="../static/IMG/Rectangle 6.png" class="rounded-full w-[50px] h-[50px] profile-btn cursor-pointer">

    </div>
    <div class="relative w-full h-[88px] bg-[#6EB6F9] pt-4">
    </div>
</div>


<div class="w-full h-screen flex">
    <div class="menu w-[450px] h-screen border-2 border-gray-100">
        <ul>
            <li class="menu-item cursor-pointer">
                <iconify-icon icon="ri:profile-line"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                Thông tin của tôi
            <li class="personal-infor-btn menu-item cursor-pointer sub-item">
                <iconify-icon icon="codicon:account"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                Thông tin cá nhân
            </li>
            <li class="contact-infor-btn menu-item cursor-pointer sub-item">
                <iconify-icon icon="ri:profile-line"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                Thông tin liên hệ
            </li>
            </li>
            <li class="menu-item cursor-pointer">
                <iconify-icon icon="mdi:shield-account"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                Bảo mật
            <li class="pwd-change-btn menu-item cursor-pointer sub-item">
                <iconify-icon icon="material-symbols:key"
                              class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                Đổi mật khẩu
            </li>
            </li>
        </ul>
    </div>
    <div class="content w-full border-2 border-gray-100 m-10 p-10">
        <div class="personal-infor-page">
            <p class="text-3xl leading-10">Thông tin cá nhân</p>
            <p class="text-lg leading-10">Quản lý thông tin cá nhân của bạn</p>
            <img src="../IMG/Rectangle 6.png" class="w-52 h-52 ml-auto mr-auto mt-5 rounded-full">
            <div class="input-section mt-5 flex flex-col gap-5">
                <label for="" class="text-xl text-gray-600">Tên tài khoản</label>
                <input type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">
                <label for="" class="text-xl text-gray-600">Tên hiển thị</label>
                <input type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">
                <div class="flex justify-between gap-5">
                    <div class="flex flex-col w-full gap-5">
                        <label for="" class="text-xl text-gray-600">Ngày sinh</label>
                        <input type="date" class="w-full pl-5 pr-5 h-12 bg-white border-2 rounded-md">
                    </div>
                    <div class="flex flex-col w-full gap-5">
                        <label for="" class="text-xl text-gray-600">Giới tính</label>
                        <select type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">
                            <option value="Nam">Nam</option>
                            <option value="Nữ">Nữ</option>
                        </select>
                    </div>
                </div>
                <div class="flex justify-end gap-5">
                    <div class="text-xl text-white border-2 p-4 rounded-md cursor-pointer bg-gray-600">Hủy bỏ</div>
                    <div class="text-xl text-sky-600 border-2 p-4 rounded-md cursor-pointer">Cập nhật</div>
                </div>
            </div>
        </div>

        <div class="contact-infor-page">
            <p class="text-3xl leading-10">Thông tin liên hệ</p>
            <p class="text-lg leading-10">Quản lý thông tin liên hệ của bạn</p>
            <div class="input-section mt-5 flex flex-col gap-5">
                <label for="" class="text-xl text-gray-600">Tên thật</label>
                <input type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">
                <label for="" class="text-xl text-gray-600">Số điện thoại</label>
                <input type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">
                <label for="" class="text-xl text-gray-600">Địa chỉ</label>
                <input type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">

                <div class="flex justify-end gap-5">
                    <div class="text-xl text-white border-2 p-4 rounded-md cursor-pointer bg-gray-600">Hủy bỏ</div>
                    <div class="text-xl text-sky-600 border-2 p-4 rounded-md cursor-pointer">Cập nhật</div>
                </div>
            </div>
        </div>

        <div class="pwd-change-page">
            <p class="text-3xl leading-10">Đổi mật khẩu</p>
            <p class="text-lg leading-10">Thay đổi mật khẩu cho tài khoản của bạn.</p>
            <div class="input-section mt-5 flex flex-col gap-5">
                <label for="" class="text-xl text-gray-600">Mật khẩu hiện tại</label>
                <input type="text" class="w-full pl-5 h-12 bg-white border-2 rounded-md">
                <label for="" class="text-xl text-gray-600">Mật khẩu mới</label>
                <input type="password" class="w-full pl-5 pr-5 h-12 bg-white border-2 rounded-md">
                <label for="" class="text-xl text-gray-600">Xác nhận mật khẩu mới</label>
                <input type="password" class="w-full pl-5 pr-5 h-12 bg-white border-2 rounded-md">

                <div class="flex justify-end gap-5">
                    <div class="text-xl text-white border-2 p-4 rounded-md cursor-pointer bg-gray-600">Hủy bỏ</div>
                    <div class="text-xl text-sky-600 border-2 p-4 rounded-md cursor-pointer">Cập nhật</div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/iconify-icon@1.0.7/dist/iconify-icon.min.js"></script>
<script language="javascript" src="../JS/profile-setting.js"></script>
</body>
</html>

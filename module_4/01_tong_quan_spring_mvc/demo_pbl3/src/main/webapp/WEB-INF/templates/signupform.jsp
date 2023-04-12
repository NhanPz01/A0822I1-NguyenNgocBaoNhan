<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11-Apr-23
  Time: 2:22 PM
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

    <link rel="stylesheet" href="../CSS/signup-form.css">
</head>
<body>
<div class="signup-form">
    <form class="abc mt-[100px] mb-[100px] ml-[60%] w-[30%] h-screen" th:action="@{/userSignup}" th:object="${user}"
          method="post">
        <div class="prev-section  gap-7 flex flex-col ">
            <p class="font-semibold text-3xl">Đăng ký</p>
            <input type="text"
                   class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                   placeholder="Tên">
            <input type="text"
                   class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                   placeholder="Số điện thoại">
            <input type="email"
                   class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                   placeholder="Email">
            <input type="text" th:field="*{username}"
                   class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                   placeholder="Tài khoản">
            <input type="password" th:field="*{password}"
                   class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                   placeholder="Mật khẩu">
            <div class="flex justify-between gap-5">
                <div class="flex flex-col w-full gap-5">
                    <label for="" class="text-lg text-gray-600">Ngày sinh</label>
                    <input type="date"
                           class="pr-5 form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300">
                </div>
                <div class="flex flex-col w-full gap-5">
                    <label for="" class="text-lg text-gray-600">Giới tính</label>
                    <select type="text"
                            class="pr-5 form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300">
                        <option value="Nam">Nam</option>
                        <option value="Nữ">Nữ</option>
                    </select>
                </div>
            </div>
            <div class="next-section-btn bg-sky-400 flex items-center justify-center w-full h-[55px] rounded-3xl text-white font-bold text-[20px] cursor-pointer shadow-md shadow-gray-300 mt-5">
                Tiếp theo
            </div>
        </div>
        <div class="next-section  gap-7 flex flex-col ">
            <p class="font-semibold text-3xl">Đăng ký</p>
            <div class="flex flex-col w-full gap-5">
                <label for="" class="text-lg text-gray-600">Loại tài khoản</label>
                <select type="text"
                        class="account-type pr-5 form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300">
                    <option value="Doctor">Bác sĩ</option>
                    <option value="Patient">Bệnh nhân</option>
                </select>
            </div>
            <div class="doctor-section flex flex-col justify-between gap-5">
                <input type="text"
                       class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                       placeholder="Chuyên khoa">
                <input type="text"
                       class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                       placeholder="Bệnh viện đang công tác">
                <input type="text"
                       class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                       placeholder="Số năm kinh nghiệm">
                <input type="text"
                       class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                       placeholder="Địa chỉ phòng khám tư">
            </div>
            <div class="patient-section flex flex-col justify-between gap-5">
                <input type="text"
                       class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                       placeholder="Nghề nghiệp">
                <input type="text"
                       class="form-control w-full h-[55px] border-black border-[1px] rounded-3xl bg-[#00000000] pl-6 shadow-md shadow-gray-300"
                       placeholder="Mã số thẻ BHYT">
            </div>
            <div class="flex justify-between gap-5">
                <div class="prev-section-btn bg-sky-400 flex items-center justify-center w-full h-[55px] rounded-3xl text-white font-bold text-[20px] cursor-pointer shadow-md shadow-gray-300 mt-5">
                    Quay lại
                </div>
                <button type="submit"
                        class="btn bg-[#6AFF79] flex items-center justify-center w-full h-[55px] rounded-3xl text-white font-bold text-[20px] cursor-pointer shadow-md shadow-gray-300 mt-5">
                    Đăng kí
                </button>
            </div>
        </div>
    </form>
</div>
<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
<script language="javascript" src="../JS/signup-form.js"></script>
</body>
</html>

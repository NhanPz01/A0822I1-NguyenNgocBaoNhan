<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11-Apr-23
  Time: 2:14 PM
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


    <link rel="stylesheet" href="../CSS/main.css">
</head>
<body>
<div class="header shadow-md shadow-gray-400 z-20 sticky top-0">
    <div class="account-section absolute flex z-10 gap-2 right-5">

    </div>
    <div class="relative w-full h-[88px] bg-[#6EB6F9] pt-4">

        <div class="relative w-[60%] h-[38px] m-auto">
            <input class="w-full h-full bg-white rounded pl-10" placeholder="Tìm kiếm">
            <div class="absolute w-6 h-6 bg-[#6EB6F9] right-2 top-2 flex justify-center items-center rounded-md">
                <iconify-icon icon="ic:baseline-search" class="text-white"></iconify-icon>
            </div>
            </input>
        </div>
        <div class="flex justify-center gap-5 mt-2">
            <p>Mới nhất</p>
            <p>Tin tức</p>
            <p>Tiêu biểu</p>
            <p>Diễn đàn</p>
            <p>Sự kiện</p>
            <p>Hỗ trợ</p>
            <p>Liên hệ</p>
        </div>
    </div>
</div>
<div class="decor">
    <div class="absolute w-full z-10 mt-2">
        <div>
            <img src="../IMG/decor.png" class="main-decor h-[260px] bg-auto object-cover mt-4 ml-[38px] mr-[38px]">
            <img src="../IMG/Vector 1.png" class="main-decor-vector">
        </div>
    </div>
    <div class="relative">
        <img src="../IMG/decor.png" class="w-full h-[260px] bg-auto blur-sm object-cover">
        <div class="absolute w-full h-full bg-[#3838386c] top-0"></div>
    </div>
</div>
<div class="hotnews z-10 h-[300px] mt-[100px] m-5">
    <div class="flex items-center ">
        <p class="col-text h-full text-lg">NEWS</p>
        <div class="newsbox pt-3 pb-3 w-full flex justify-between">
            <div class="newscard flex gap-3 w-[48%] relative">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[250px] object-cover">
                <div class="newscontent pr-4">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[15px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                </div>
                <div class="absolute top-[-10px] left-3 w-full">
                    <img src="../IMG/Vector 2.png" class="news-decor-vector">
                </div>
            </div>
            <div class="newscard flex gap-3 w-[48%] relative">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[250px] object-cover">
                <div class="newscontent pr-4">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[15px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                </div>
                <div class="absolute top-[-10px] left-3 w-full">
                    <img src="../IMG/Vector 2.png" class="news-decor-vector">
                </div>
            </div>
        </div>
    </div>
    <div class="flex items-center mr-10 justify-end gap-2 mt-4">

        <p class="text-black font-bold text-[13px]">Xem thêm</p>
        <iconify-icon icon="material-symbols:arrow-forward-sharp" rotate="0deg" class="w-[35px]"></iconify-icon>
    </div>
</div>
<div class="news bg-white w-full mt-4 pt-[40px] pb-5">
    <p class="text-black text-center font-bold text-[20px] news-header-text">Tin tức</p>
    <div class="newsbox pt-7 pb-3 w-full p-8 flex flex-col gap-6">
        <div class="newscard w-full ">
            <div class="flex gap-3">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[155px]">
                <div class="newscontent">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[16px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                    <div class="flex gap-4">
                        <p class="text-red-400 text-[14px] font-bold">Tên tác giả</p>
                        <p class="text-gray-400 font-semibold text-[14px]">Thứ 2, 2/4/2003</p>
                    </div>
                </div>
            </div>
            <div class="border-[1px] border-gray-400 w-full mt-4"></div>
        </div>
        <div class="newscard w-full">
            <div class="flex gap-3">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[155px]">
                <div class="newscontent">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[16px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                    <div class="flex gap-4">
                        <p class="text-red-400 text-[14px] font-bold">Tên tác giả</p>
                        <p class="text-gray-400 font-semibold text-[14px]">Thứ 2, 2/4/2003</p>
                    </div>
                </div>
            </div>
            <div class="border-[1px] border-gray-400 w-full mt-4"></div>
        </div>

        <div class="newscard w-full">
            <div class="flex gap-3">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[155px]">
                <div class="newscontent">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[16px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                    <div class="flex gap-4">
                        <p class="text-red-400 text-[14px] font-bold">Tên tác giả</p>
                        <p class="text-gray-400 font-semibold text-[14px]">Thứ 2, 2/4/2003</p>
                    </div>
                </div>
            </div>
            <div class="border-[1px] border-gray-400 w-full mt-4"></div>
        </div>

        <div class="newscard w-full">
            <div class="flex gap-3">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[155px]">
                <div class="newscontent">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[16px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                    <div class="flex gap-4">
                        <p class="text-red-400 text-[14px] font-bold">Tên tác giả</p>
                        <p class="text-gray-400 font-semibold text-[14px]">Thứ 2, 2/4/2003</p>
                    </div>
                </div>
            </div>
            <div class="border-[1px] border-gray-400 w-full mt-4"></div>
        </div>

        <div class="newscard w-full">
            <div class="flex gap-3">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[155px]">
                <div class="newscontent">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[16px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                    <div class="flex gap-4">
                        <p class="text-red-400 text-[14px] font-bold">Tên tác giả</p>
                        <p class="text-gray-400 font-semibold text-[14px]">Thứ 2, 2/4/2003</p>
                    </div>
                </div>
            </div>
            <div class="border-[1px] border-gray-400 w-full mt-4"></div>
        </div>

        <div class="newscard w-full">
            <div class="flex gap-3">
                <img src="../IMG/Rectangle 6.png" class="w-[250px] h-[155px]">
                <div class="newscontent">
                    <p class="text-black font-bold text-[18px]">Tiêu đề</p>
                    <p class="text-[#909090] font-bold text-[16px]">Lorem ipsum dolor sit amet, consectetur adipiscing
                        elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                    <div class="flex gap-4">
                        <p class="text-red-400 text-[14px] font-bold">Tên tác giả</p>
                        <p class="text-gray-400 font-semibold text-[14px]">Thứ 2, 2/4/2003</p>
                    </div>
                </div>
            </div>
            <div class="border-[1px] border-gray-400 w-full mt-4"></div>
        </div>
    </div>
    <div class="new-footer flex gap-5 justify-center items-center">
        <img src="../IMG/Group 8.png" class="h-4">
        <img src="../IMG/Group 5.png" class="h-4">
        <a href=""><p class="text-black font-bold text-[16px]">1</p></a>
        <a href=""><p class="text-black font-bold text-[16px]">2</p></a>
        <p class="text-black font-bold text-[16px]">...</p>
        <a href=""><p class="text-black font-bold text-[16px]">10</p></a>
        <img src="../IMG/Group 5.png" class="h-4 rotate-180">
        <img src="../IMG/Group 8.png" class="h-4 rotate-180">
    </div>
</div>
<div class="representative w-full h-[800px] relative">
    <div class="absolute w-full h-full bg-[#132b9429]"></div>
    <div class="relative w-full flex gap-14 pl-[55px] pr-[55px] pt-[100px]">
        <div class="doctor-card rounded-lg h-auto bg-white flex flex-col items-center w-full pt-10 pb-10">
            <img src="../IMG/image 4.png" class="ava rounded-full w-[70%] aspect-square"></img>
            <div class="mt-7 text-[20px] font-bold text-[#B4C5FF]">Tên</div>
            <div class="text-[16px] font-bold">Chức vụ</div>
            <div class="text-gray-500 pl-10 pr-10">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
            </div>
        </div>
        <div class="doctor-card rounded-lg h-auto bg-white flex flex-col items-center w-full pt-10 pb-10">
            <img src="../IMG/image 4.png" class="ava rounded-full w-[70%] aspect-square"></img>
            <div class="mt-7 text-[20px] font-bold text-[#B4C5FF]">Tên</div>
            <div class="text-[16px] font-bold">Chức vụ</div>
            <div class="text-gray-500 pl-10 pr-10">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
            </div>
        </div>
        <div class="doctor-card rounded-lg h-auto bg-white flex flex-col items-center w-full pt-10 pb-10">
            <img src="../IMG/image 4.png" class="ava rounded-full w-[70%] aspect-square"></img>
            <div class="mt-7 text-[20px] font-bold text-[#B4C5FF]">Tên</div>
            <div class="text-[16px] font-bold">Chức vụ</div>
            <div class="text-gray-500 pl-10 pr-10">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
            </div>
        </div>
        <div class="doctor-card rounded-lg h-auto bg-white flex flex-col items-center w-full pt-10 pb-10">
            <img src="../IMG/image 4.png" class="ava rounded-full w-[70%] aspect-square"></img>
            <div class="mt-7 text-[20px] font-bold text-[#B4C5FF]">Tên</div>
            <div class="text-[16px] font-bold">Chức vụ</div>
            <div class="text-gray-500 pl-10 pr-10">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua.
            </div>
        </div>
    </div>
</div>

<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/iconify-icon@1.0.7/dist/iconify-icon.min.js"></script>
<script language="javascript" src="../JS/home.js"></script>
<script th:inline="javascript">

    let isLogout = false
    var name = /*[[${name}]]*/ '';

    function checkLogin() {

        if (name != "" && name != "null" && isLogout == false) {
            console.log(name)
            document.querySelector('.account-section').innerHTML =
                `<div class="absolute flex z-10 gap-2 top-5 right-10 flex-col items-end">
			<div class="flex gap-4 items-center">
				<p class="text-base font-medium">${name}</p>
	            <img src="../IMG/Rectangle 6.png" class="flex rounded-full w-[50px] h-[50px] profile-btn cursor-pointer" onclick="toggle()" style="width: 50px">
			</div>
            <div class="w-[250px] bg-white shadow-md flex-col justify-around profile-menu">
                <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center ">
                    <iconify-icon icon="codicon:account" class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                    <a href="./profile.html"><p class=" text-gray-500 text-lg font-semibold cursor-pointer">Trang cá nhân</p></a>
                </div>
                <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center">
                    <iconify-icon icon="material-symbols:manage-search" class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                    <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Quản lý nội dung</p>
                </div>
                <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center">
                    <iconify-icon icon="material-symbols:manage-history"  class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                    <p class=" text-gray-500 text-lg font-semibold cursor-pointer">Lịch sử hoạt động</p>
                </div>
                <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center ">
                    <iconify-icon icon="ep:setting"  class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                    <a href="./profile-setting.html"><p class=" text-gray-500 text-lg font-semibold cursor-pointer">Tùy chỉnh</p></a>
                </div>
                <div class="menu-item h-full pl-[20px] gap-4 flex text-gray-500 items-center">
                    <iconify-icon icon="ri:logout-box-line"  class="w-[30px] h-[30px] flex justify-center items-center"></iconify-icon>
                    <p class=" text-gray-500 text-lg font-semibold cursor-pointer" onclick="logout()">Đăng xuất</p>
                </div>
            </div>
        </div>`
        } else {
            document.querySelector('.account-section').innerHTML =
                `<div class="flex z-10 gap-2 right-5 mt-6">
        	<a th:href="@{signup-form.html}"><p class="text-[14px]">Đăng kí</p></a>
        	<p>|</p>
        	<a href="./loginform.html"><p class="text-[14px]">Đăng nhập</p></a>
        </div>`
        }
    }

    function logout() {
        isLogout = true;
        checkLogin();
    }

    checkLogin()
</script>
</body>
</html>

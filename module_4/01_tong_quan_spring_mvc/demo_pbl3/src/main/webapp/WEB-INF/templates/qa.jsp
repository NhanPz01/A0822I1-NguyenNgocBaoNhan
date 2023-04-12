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


    <link rel="stylesheet" href="../static/CSS/post.css">
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
            <img src="../static/IMG/decor.png"
                 class="main-decor h-[260px] bg-auto object-cover mt-4 ml-[38px] mr-[38px]">
            <img src="../static/IMG/Vector 1.png" class="main-decor-vector">
        </div>
    </div>
    <div class="relative">
        <img src="../static/IMG/decor.png" class="w-full h-[260px] bg-auto blur-sm object-cover">
        <div class="absolute w-full h-full bg-[#3838386c] top-0"></div>
    </div>
</div>

<div class="flex bg-[#0B1A33] mt-10 gap-20 items-center pl-10">
    <div class="qa-type relative text-xl text-white p-5 cursor-pointer h-full">
        <div class="underline absolute h-1 bg-white bottom-0 translate-x-[-20px]"></div>
        <div>Mới nhất</div>
    </div>
    <div class="qa-type relative text-xl text-white p-5 cursor-pointer h-full">
        <div class="underline absolute h-1 bg-white bottom-0 translate-x-[-20px]"></div>
        <div>Bookmark</div>
    </div>
</div>

<div class="qa-section p-10">
    <div class="qa-box">
        <div class="flex">
            <div class="w-[30%] flex flex-col gap-5 justify-around">
                <div class="flex gap-5">
                    <iconify-icon icon="material-symbols:calendar-month-rounded"
                                  class="text-3xl text-gray-500"></iconify-icon>
                    <div class="text-gray-500">Khoảng 1 giờ trước</div>
                </div>
                <div class="flex gap-5 items-center">
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:round-reply" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="material-symbols:thumbs-up-down"
                                      class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:baseline-mode-comment" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                </div>
            </div>
            <div class="flex gap-5 items-start">
                <img src="../static/IMG/Rectangle 6.png" class="w-16 h-16 rounded-full object-cover">
                <div class="flex flex-col">
                    <div class="flex gap-5 items-end">
                        <div class="text-lg font-semibold text-blue-500">Name</div>
                        <div class="text-md font-semibold text-gray-500">17/6/2023 8:00AM</div>
                    </div>
                    <div class="title">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                    </div>
                </div>
            </div>
        </div>
        <div class="border-[1px] border-solid border-gray-300 mt-10 mb-10"></div>
    </div>
    <div class="qa-box">
        <div class="flex">
            <div class="w-[30%] flex flex-col gap-5 justify-around">
                <div class="flex gap-5">
                    <iconify-icon icon="material-symbols:calendar-month-rounded"
                                  class="text-3xl text-gray-500"></iconify-icon>
                    <div class="text-gray-500">Khoảng 1 giờ trước</div>
                </div>
                <div class="flex gap-5 items-center">
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:round-reply" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="material-symbols:thumbs-up-down"
                                      class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:baseline-mode-comment" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                </div>
            </div>
            <div class="flex gap-5 items-start">
                <img src="../static/IMG/Rectangle 6.png" class="w-16 h-16 rounded-full object-cover">
                <div class="flex flex-col">
                    <div class="flex gap-5 items-end">
                        <div class="text-lg font-semibold text-blue-500">Name</div>
                        <div class="text-md font-semibold text-gray-500">17/6/2023 8:00AM</div>
                    </div>
                    <div class="title">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                    </div>
                </div>
            </div>
        </div>
        <div class="border-[1px] border-solid border-gray-300 mt-10 mb-10"></div>
    </div>
    <div class="qa-box">
        <div class="flex">
            <div class="w-[30%] flex flex-col gap-5 justify-around">
                <div class="flex gap-5">
                    <iconify-icon icon="material-symbols:calendar-month-rounded"
                                  class="text-3xl text-gray-500"></iconify-icon>
                    <div class="text-gray-500">Khoảng 1 giờ trước</div>
                </div>
                <div class="flex gap-5 items-center">
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:round-reply" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="material-symbols:thumbs-up-down"
                                      class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:baseline-mode-comment" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                </div>
            </div>
            <div class="flex gap-5 items-start">
                <img src="../static/IMG/Rectangle 6.png" class="w-16 h-16 rounded-full object-cover">
                <div class="flex flex-col">
                    <div class="flex gap-5 items-end">
                        <div class="text-lg font-semibold text-blue-500">Name</div>
                        <div class="text-md font-semibold text-gray-500">17/6/2023 8:00AM</div>
                    </div>
                    <div class="title">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                    </div>
                </div>
            </div>
        </div>
        <div class="border-[1px] border-solid border-gray-300 mt-10 mb-10"></div>
    </div>
    <div class="qa-box">
        <div class="flex">
            <div class="w-[30%] flex flex-col gap-5 justify-around">
                <div class="flex gap-5">
                    <iconify-icon icon="material-symbols:calendar-month-rounded"
                                  class="text-3xl text-gray-500"></iconify-icon>
                    <div class="text-gray-500">Khoảng 1 giờ trước</div>
                </div>
                <div class="flex gap-5 items-center">
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:round-reply" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="material-symbols:thumbs-up-down"
                                      class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                    <div class="flex gap-1">
                        <iconify-icon icon="ic:baseline-mode-comment" class="text-xl text-gray-500"></iconify-icon>
                        <div class="text-xl text-gray-500">-1</div>
                    </div>
                </div>
            </div>
            <div class="flex gap-5 items-start">
                <img src="../static/IMG/Rectangle 6.png" class="w-16 h-16 rounded-full object-cover">
                <div class="flex flex-col">
                    <div class="flex gap-5 items-end">
                        <div class="text-lg font-semibold text-blue-500">Name</div>
                        <div class="text-md font-semibold text-gray-500">17/6/2023 8:00AM</div>
                    </div>
                    <div class="title">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore magna aliqua.
                    </div>
                </div>
            </div>
        </div>
        <div class="border-[1px] border-solid border-gray-300 mt-10 mb-10"></div>
    </div>

</div>

<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/iconify-icon@1.0.7/dist/iconify-icon.min.js"></script>
<script language="javascript" src="../static/JS/post.js"></script>

</body>
</html>

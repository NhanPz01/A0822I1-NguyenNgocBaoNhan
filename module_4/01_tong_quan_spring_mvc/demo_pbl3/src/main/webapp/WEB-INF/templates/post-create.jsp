<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11-Apr-23
  Time: 2:18 PM
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


    <link rel="stylesheet" href="../static/CSS/qa.css">
</head>
<body>
<div class="header shadow-md shadow-gray-400 z-20 sticky top-0">
    <div class="account-section absolute flex z-10 gap-2 right-5">

    </div>
    <div class="relative w-full h-[88px] bg-[#6EB6F9] pt-4">

    </div>
</div>

<form action="" class="m-10 flex flex-col gap-8 h-full">
    <input type="text" placeholder="Tiêu đề" class="p-5 border-2 border-gray-200 w-full rounded-lg">
    <input type="text" placeholder="Gắn thẻ bài viết của bạn" class="p-5 border-2 border-gray-200 w-full rounded-lg">
    <textarea placeholder="Mời bạn nhập bài viết"
              class="p-5 border-2 border-gray-200 w-full rounded-lg h-full"></textarea>
    <button type="submit" class="right-0 left-0 mr-0 ml-auto bg-sky-500 text-white text-lg p-4 rounded-lg">Xuất bản
    </button>
</form>

<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/iconify-icon@1.0.7/dist/iconify-icon.min.js"></script>
<script language="javascript" src="../static/JS/qa.js"></script>

</body>
</html>

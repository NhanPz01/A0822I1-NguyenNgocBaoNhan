window.onload = function()
{
    if(localStorage.getItem('username'))
    {
        let username  = localStorage.getItem('username')

        document.querySelector('.account-section').innerHTML = 
        `<div class="absolute flex z-10 gap-2 top-5 right-10 flex-col items-end">
            <img src="../static/IMG/Rectangle 6.png" class="flex rounded-full w-[50px] h-[50px] profile-btn cursor-pointer" onclick="toggle()" style="width: 50px">
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
    }
    else
    {
        document.querySelector('.account-section').innerHTML = 
        `<div class="flex z-10 gap-2 right-5 mt-6">
        <p class="text-[14px]">Đăng kí</p>
        <p>|</p>
        <a href="./loginform.html"><p class="text-[14px]">Đăng nhập</p></a>
        </div>`
    }
}

function toggle(){
    document.querySelector('.profile-menu').classList.toggle('clicked')
}

function logout(){
    localStorage.removeItem('username')
}

use furamaresort;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- 		(Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

-- dùng with tương tự cách đặt biến T^T
with count_used as (
    select
        ma_dich_vu_di_kem,
        ten_dich_vu_di_kem,
        sum(so_luong) tong_so_luong_dvdk
    from
        dich_vu_di_kem
        join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu = dich_vu_di_kem.ma_dich_vu_di_kem
    group by
        ma_dich_vu_di_kem
)
-- !!!
select
    ma_dich_vu_di_kem,
    ten_dich_vu_di_kem,
    tong_so_luong_dvdk
from
    count_used
where
    tong_so_luong_dvdk = (
        select
            max(tong_so_luong_dvdk)
        from
            count_used
    );
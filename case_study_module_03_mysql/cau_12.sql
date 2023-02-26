use furamaresort;

-- 12.	Hiển thị thông tin 
-- 		ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), 
-- 		so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- 		tien_dat_coc 
-- 		của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 
-- 		nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select
    ma_hop_dong,
    nv.ho_ten,
    kh.ho_ten,
    kh.so_dien_thoai,
    ten_dich_vu,
    sum(tien_dat_coc) tong_tien_coc,
    sum(so_luong) tong_so_luong_dvdk
from
    hop_dong
    left join nhan_vien nv using (ma_nhan_vien)
    left join dich_vu using (ma_dich_vu)
    left join khach_hang kh using (ma_khach_hang)
    left join hop_dong_chi_tiet using (ma_hop_dong)
    left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = dich_vu.ma_dich_vu
where (
        ngay_lam_hop_dong between '2020-10-01' and '2020-12-30'
	  ) and (
        ngay_lam_hop_dong not between '2021-01-01' and '2021-06-30'
	  )
group by ma_hop_dong;
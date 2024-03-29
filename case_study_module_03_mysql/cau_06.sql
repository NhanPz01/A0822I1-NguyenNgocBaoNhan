use furamaresort;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- 		của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

select 
	ma_dich_vu, 
    ten_dich_vu, 
    dien_tich, 
    chi_phi_thue, 
    ten_loai_dich_vu 
from
	dich_vu
    inner join loai_dich_vu using (ma_loai_dich_vu)
where
	ma_dich_vu not in (
		select 
            ma_dich_vu
        from
            dich_vu
            join hop_dong using (ma_dich_vu)
        where
            ngay_lam_hop_dong between '2021-01-01'
            and '2021-03-31'
    );
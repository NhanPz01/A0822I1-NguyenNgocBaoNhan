use furamaresort;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và 
-- 		có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select
	ten_dich_vu_di_kem,
    gia,
    don_vi,
    trang_thai
from
	dich_vu_di_kem dvdk
    join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu
    join hop_dong hd using (ma_hop_dong)
    join khach_hang kh using (ma_khach_hang)
    join loai_khach lk using (ma_loai_khach)
where
	ten_loai_khach = 'Diamond'
    and (
		dia_chi like '%Vinh%'
        or dia_chi like '%Quảng Ngãi%'
    );
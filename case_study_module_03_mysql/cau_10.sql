use furamaresort;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- 		Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- 		(được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select
	ma_hop_dong,
    ngay_lam_hop_dong, 
    ngay_ket_thuc, 
    tien_dat_coc, 
    so_luong_dich_vu_di_kem
from 
	hop_dong
    join dich_vu_di_kem
    on hop_dong.ma_dich_vu = dich_vu_di_kem.ma_dich_vu_di_kem
where
	;
use furamaresort;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm 
-- 		ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).

select
	ma_hop_dong,
	ten_loai_dich_vu,
	ten_dich_vu_di_kem,
	count(ma_dich_vu_di_kem) so_lan_su_dung    
from
	dich_vu_di_kem
	join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu = dich_vu_di_kem.ma_dich_vu_di_kem
	join hop_dong using (ma_hop_dong)
	join dich_vu on dich_vu.ma_dich_vu = dich_vu_di_kem.ma_dich_vu_di_kem
	join loai_dich_vu using (ma_loai_dich_vu)
group by
	ma_dich_vu_di_kem
	having so_lan_su_dung = 1;
use furamaresort;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm 
-- 		ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select
    ma_nhan_vien,
    ho_ten,
    ten_trinh_do,
    ten_bo_phan,
    so_dien_thoai,
    dia_chi,
    count(hd.ma_nhan_vien) tong_so_hop_dong
from
    nhan_vien
    join trinh_do td using (ma_trinh_do)
    join bo_phan bp using (ma_bo_phan)
    join hop_dong hd using (ma_nhan_vien)
where
    year(ngay_lam_hop_dong) between 2020 and 2021
group by
    hd.ma_nhan_vien
	having tong_so_hop_dong <= 3;
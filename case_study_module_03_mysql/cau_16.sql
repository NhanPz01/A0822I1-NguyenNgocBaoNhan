use furamaresort;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

delete from
    nhan_vien nv
where
    not exists (
        select
            *
        from
            hop_dong
        where
            ma_nhan_vien = nv.ma_nhan_vien
            and year(ngay_lam_hop_dong) between 2019 and 2021
	)
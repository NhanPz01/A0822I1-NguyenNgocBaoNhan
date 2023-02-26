use furamaresort;

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- 		chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.

update
    khach_hang
set
    ma_loai_khach = 1
where
    ma_khach_hang in (
        select
            t.ma_khach_hang
        from
            (
                select
                    kh.ma_khach_hang,
                    kh.ho_ten,
                    lk.ten_loai_khach,
                    hd.ma_hop_dong,
                    dv.ten_dich_vu,
                    hd.ngay_lam_hop_dong,
                    hd.ngay_ket_thuc,
                    (sum(dvdk.gia * hdct.so_luong) + tmp.gia_dv) tong_tien
                from
                    khach_hang kh
                    left join loai_khach lk using (ma_loai_khach)
                    left join hop_dong hd using (ma_khach_hang)
                    left join dich_vu dv using (ma_dich_vu)
                    left join hop_dong_chi_tiet hdct using (ma_hop_dong)
                    left join dich_vu_di_kem dvdk on dv.ma_dich_vu = dvdk.ma_dich_vu_di_kem
                    left join (
                        select
                            kh.ma_khach_hang as ma_khach_hang,
                            sum(dv.chi_phi_thue) as gia_dv
                        from
                            khach_hang kh
                            join hop_dong hd using (ma_khach_hang)
                            join dich_vu dv using (ma_dich_vu)
                        group by
                            kh.ma_khach_hang
                    ) as tmp using (ma_khach_hang)
                where
                    ten_loai_khach = 'Platinium'
                group by
                    kh.ma_khach_hang
                having
                    tong_tien > 1000000
            ) t
    );
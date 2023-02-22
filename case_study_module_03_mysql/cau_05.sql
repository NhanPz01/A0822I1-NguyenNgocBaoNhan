use furamaresort;

-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- 	(Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, 
-- 	với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- 	cho tất cả các khách hàng đã từng đặt phòng. 
-- 	(những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

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
    left join dich_vu_di_kem dvdk on (dvdk.ma_dich_vu_di_kem = dv.ma_dich_vu)
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
    ) tmp using (ma_khach_hang)
group by
    kh.ma_khach_hang;
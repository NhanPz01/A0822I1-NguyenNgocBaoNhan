SELECT
    hd.ma_hop_dong,
    hd.ngay_lam_hop_dong,
    hd.ngay_ket_thuc,
    sum(hd.tien_dat_coc) tong_tien_coc,
    IFNULL(sum(hdct.so_luong), 0) so_luong_dich_vu_di_kem
FROM
    hop_dong hd
    left JOIN hop_dong_chi_tiet hdct ON hd.ma_hop_dong = hdct.ma_hop_dong
GROUP by
    hd.ma_hop_dong
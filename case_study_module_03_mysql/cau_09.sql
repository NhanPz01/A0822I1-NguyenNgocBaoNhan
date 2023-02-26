use furamaresort;

-- 9.	Thực hiện thống kê doanh thu theo tháng, 
-- 		nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select
    tmp.thang,
    co.so_lan_khach_dat
from
    (
        select
            1 as thang
        union
        select
            2 as thang
        union
        select
            3 as thang
        union
        select
            4 as thang
        union
        select
            5 as thang
        union
        select
            6 as thang
        union
        select
            7 as thang
        union
        select
            8 as thang
        union
        select
            9 as thang
        union
        select
            10 as thang
        union
        select
            11 as thang
        union
        select
            12 as thang
    ) as tmp
    left join (
        select
            month(ngay_lam_hop_dong) as thang,
            count(ma_khach_hang) as so_lan_khach_dat
        from
            hop_dong
        where
            year(ngay_lam_hop_dong) = '2021'
        group by
            thang
    ) as co using (thang);
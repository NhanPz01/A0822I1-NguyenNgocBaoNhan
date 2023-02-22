use furamaresort;

-- 9.	Thực hiện thống kê doanh thu theo tháng, 
-- 		nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select 
	count(1) as `Tháng`, 
    count(ma_khach_hang)
from 
	hop_dong, khach_hang
where
	hop_dong
    join khach_hang using (ma_khach_hang)
    
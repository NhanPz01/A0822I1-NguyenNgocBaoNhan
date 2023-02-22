use furamaresort;

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select kh.ho_ten, count(hd.ma_khach_hang) as `So lan`
from khach_hang kh, hop_dong hd, loai_khach lk
where kh.ma_loai_khach = lk.ma_loai_khach
and lk.ten_loai_khach = 'Diamond'
and kh.ma_khach_hang = hd.ma_khach_hang
group by kh.ma_khach_hang
order by count(hd.ma_khach_hang) asc;
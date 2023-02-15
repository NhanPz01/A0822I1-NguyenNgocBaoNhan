use QuanLyBanHang;

select * from Customer;
insert into Customer (cName, cAge)
values ('Minh Quan', 10),
	   ('Ngoc Oanh', 20),
       ('Hong Ha', 50);

select * from `Order`;
insert into `Order` (cID, oDate, oTotalPrice)
values (1, '2006-3-21', null),
	   (2, '2006-3-23', null),
       (1, '2006-3-16', null);

select * from Product;
insert into Product (pName, pPrice)
values ('May Giat', 3),
	   ('Tu Lanh', 5),
       ('Dieu Hoa', 7),
       ('Quat', 1),
       ('Bep Dien', 2);
       
select * from OrderDetail;
insert into OrderDetail
values (1, 1, 3),
	   (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
	   (3, 1, 8),
       (2, 5, 4),
       (2, 3, 3);
       
select oID, oDate, oTotalPrice from `Order`;

select cName, pName from Customer c, Product p, `Order` o, OrderDetail od
where c.cID = o.cID and o.oID = od.oID and od.pID = p.pID;

select cName, pName from Customer c, `Order` o, OrderDetail od, Product p
where c.cID = o.cID and p.pID = od.pID and o.oID = od.oID;

select cName from Customer c
left join `Order` o
on c.cID = o.cID
where o.cID is null;

select OrderDetail.oID, `Order`.oDorderdetailate, odQTY * pPrice as oPrice
from `Order` o, Product p, OrderDetail od
where od.oID = o.oID and od.pID = p.pID;
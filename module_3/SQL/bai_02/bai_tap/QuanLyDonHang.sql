create database QuanLyDonHang;
use QuanLyDonHang;

create table PhieuXuat (
	SoPX int auto_increment not null,
    NgayXuat date not null,
primary key (SoPX));

create table VatTu (
	MaVTU int auto_increment not null,
    TenVTU varchar(45),
primary key (MaVTU));

create table PhieuNhap (
	SoPN int auto_increment not null,
    NgayNhap date not null,
primary key (SoPN));
alter table DonDH
create table DonDH (
	SoDH int not null,
    NgayDH date not null,
primary key (SoDH));

create table SDT (
	SDT varchar(10),
    MaNCC int not null,
    foreign key (MaNCC) references NhaCC (MaNCC)
);

create table NhaCC (
	MaNCC int not null,
    TenNCC varchar(45) not null,
    DiaChi varchar(45) not null,
primary key (MaNCC));

create table ChiTietPhieuXuat (
	SoPX int not null,
    MaVTU int not null,
	DGXuat float not null,
    SLXuat float null,
    foreign key (SoPX) references PhieuXuat (SoPX),
    foreign key (MaVTU) references VatTu (MaVTU)
);

create table ChiTietPhieuNhap (
	MaVTU int not null,
    SoPN int not null,
    DGNhap int not null,
    SLNhap int not null,
    foreign key (MaVTU) references VatTu (MaVTU),
    foreign key (SoPN) references PhieuNhap (SoPN)
);

create table ChiTietDonDatHang (
	MaVTU int not null,
    SoDH int not null,
	foreign key (MaVTU) references VatTU (MaVTU),
    foreign key (SoDH) references DonDH (SoDH)
);

package util;

public interface ConstantUtil {
    interface FilePath {
        String Customer = "src/data/customer.csv";
        String Employee = "src/data/employee.csv";
        String Villa = "src/data/villa.csv";
        String House = "src/data/house.csv";
        String Room = "src/data/room.csv";
    }

    enum Gender {
        Nam,
        Nu
    }

    enum Level {
        TrungCap,
        CaoDang,
        DaiHoc,
        SauDaiHoc
    }

    enum Role {
        LeTan,
        PhucVu,
        ChuyenVien,
        GiamSat,
        QuanLy,
        GiamDoc
    }

    enum CustomerType {
        Diamond,
        Platinum,
        Gold,
        Silver,
        Member
    }

    enum RentType {
        Year,
        Month,
        Week,
        Day,
        Hour
    }


    enum ServiceType {
        Villa,
        House,
        Room
    }

    enum RoomType {
        standard,
        superior,
        deluxe,
        suite,
        presidential
    }
}

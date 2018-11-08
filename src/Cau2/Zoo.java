package Cau2;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Chuong> DanhSachChuong = new ArrayList<>();

    public void themChuong(Chuong c) {
        DanhSachChuong.add(c);
        System.out.println("Them thanh cong");
    }

    public void xoaChuong(int machuong) {
        boolean search = false;
        for (Chuong chuong : DanhSachChuong) {
            if (chuong.maChuong==(machuong)) {
                DanhSachChuong.remove(chuong);
                System.out.printf("Da xoa chuong co ma %d\n", machuong);
                search = true;
                break;
            }   
        }
        if (search == false) {
            System.out.println("Khong tim thay chuong %d",machuong);
        }
        System.out.println("So luong chuong con lai: "+DanhSachChuong.size());
    }
}

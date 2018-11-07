package Cau1;

import java.util.Scanner;

public class Teacher extends Person {
    private String maLop;
    private double luong;
    private int gioDay;

    public int getGioDay() {
        return gioDay;
    }

    public void setGioDay(int gioDay) {
        this.gioDay = gioDay;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma lop: ");
        maLop = sc.nextLine();
        System.out.println("Nhap luong mot gio day: ");
        luong = sc.nextDouble();
        System.out.println("Nhap so gio day: ");
        gioDay = sc.nextInt();
    }

    @Override
    public void showInfo() {
        System.out.println("Ma lop: " + maLop);
        System.out.println("Luong mot gio day: " + luong);
        System.out.println("So gio day: " + gioDay);
    }

    public double tinhLuong() {
        double tienLuong = 0;
        if (maLop.contains("K") || maLop.contains("G") || maLop.contains("I") || maLop.contains("H")) {
            tienLuong = luong * gioDay;
        } else if (maLop.contains("L") || maLop.contains("M")) {
            tienLuong = luong * gioDay + 200000;
        }
        return tienLuong;

    }
}

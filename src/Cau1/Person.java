package Cau1;

import java.util.Scanner;

public class Person {
    public String ten;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void showInfo() {
        System.out.println("Ten: " + ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
    }
}

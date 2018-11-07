package Cau1;

import java.util.Scanner;

public class Student extends Person {
    private String maSV;
    private double diemTB;
    private String email;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap Mssv: ");
            maSV = sc.nextLine();
        } while (!(maSV.length() == 8));
        do {
            System.out.println("Nhap diem TB: ");
            diemTB = sc.nextDouble();
        } while (!(diemTB > 0.0 && diemTB < 10.0));
        do {
            System.out.println("Nhap Email: ");
            email = sc.nextLine();
        } while (!(email.contains("@")) && (email.contains(" ")));
        sc.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mssv: " + maSV);
        System.out.println("Diem TB: " + diemTB);
        System.out.println("Email: " + email);
    }

    public boolean isHocBong() {
        if (diemTB >= 8.0)
            return true;
        return false;
    }
}

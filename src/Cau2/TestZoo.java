package Cau2;


import java.util.Scanner;

public class TestZoo {
    static void Menu() {
        System.out.println("-----------HỆ THỐNG QUẢN LÝ SỞ THÚ----------");
        System.out.println("1.Them chuong");
        System.out.println("2.Xoa chuong");
        System.out.println("3.Them con vat");
        System.out.println("4.Xoa con vat");
        System.out.println("5.Xem tat ca con vat");
        System.out.println("6.Exit");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        int ch;

        Chuong chuong = new Chuong();
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);
        Menu();
        while (true) {
            System.out.print("Chon: ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Nhap ma so chuong: ");
                    chuong.maChuong=sc.nextLine();
                    zoo.themChuong(chuong);
                    break;
                case 2:

                    System.out.println("Nhap ma so chuong muon xoa: ");
                    String ma=sc.nextLine();
                    zoo.xoaChuong(ma);
                    break;
                case 3:
                    Tiger carry = new Tiger("Carry", 11, "abc");
                    chuong.themConVat(carry);
                    Dog john=new Dog("John",5,"abc");
                    chuong.themConVat(john);
                    Cat miu=new Cat("Miu",12,"abc");
                    chuong.themConVat(miu);
                    break;
                case 4:
                    System.out.println("Nhap ten: ");
                    String ten=sc.nextLine();
                    chuong.xoaConVat(ten);
                    break;
                case 5:
                    chuong.xemConVat();
                    break;
                case 6:
                    return;
            }
        }

    }}


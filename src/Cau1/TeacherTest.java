package Cau1;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherTest {
    ArrayList<Teacher> teachers = new ArrayList<>();

    public void inputGiangVien(int n) {
        for (int i = 0; i <= n; i++) {
            Teacher teacher = new Teacher();
            teacher.inputInfo();
            teachers.add(teacher);
        }
    }

    public void outputGiangVien() {
        if (teachers.isEmpty()) {
            System.out.println("Chua co sinh vien nao");
        } else {
            for (Teacher tc : teachers) {
                tc.showInfo();
            }
        }
    }

    public void showLuong() {
        double max=teachers.get(0).tinhLuong();
        for(int i=1;i<teachers.size();i++){
            if(max<teachers.get(i).tinhLuong()){
                max=teachers.get(i).tinhLuong();
            }
        }
        System.out.println("Luong cao nhat la: "+max);
    }

    static void Menu() {
        System.out.println("-----------QUAN LI GIANG VIEN-----------------");
        System.out.println("1.Nhap n giang vien");
        System.out.println("2.Hien thi tat ca giang vien");
        System.out.println("3.Giang vien co luong cao nhat");
        System.out.println("4.Thoat");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        int ch;
        TeacherTest teacherTest = new TeacherTest();
        Scanner sc = new Scanner(System.in);
        Menu();
        while (true) {

            System.out.print("Chon: ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Nhap so luong giang vien: ");
                    int n = sc.nextInt();
                    teacherTest.inputGiangVien(n);
                    break;
                case 2:
                    teacherTest.outputGiangVien();
                    break;
                case 3:
                    teacherTest.showLuong();
                    break;
                case 4:
                    return;
            }
        }

    }
}

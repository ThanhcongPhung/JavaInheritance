package Cau1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
    ArrayList<Student> students = new ArrayList<>();

    public void inputSinhvien(int n) {
        for (int i = 0; i <= n; i++) {
            Student student = new Student();
            student.inputInfo();
            students.add(student);
        }
    }

    public void outputSinhvien() {
        if (students.isEmpty()) {
            System.out.println("Chua co sinh vien nao");
        } else {
            for (Student st : students) {
                st.showInfo();
            }
        }
    }

    public void maxMin() {
        double tmp = students.get(0).getDiemTB();

        for (int i = 0; i < students.size(); i++) {
            if (tmp < students.get(i).getDiemTB()) {
                tmp = students.get(i).getDiemTB();
            }
        }
        System.out.println("Sinh vien diem cao nhat: " + tmp);
        for (int i = 0; i < students.size(); i++) {
            if (tmp > students.get(i).getDiemTB()) {
                tmp = students.get(i).getDiemTB();
            }
        }
        System.out.println("Sinh vien diem thap nhat: " + tmp);
    }

    public void searchStudent(String mssv) {
        if (students.isEmpty()) {
            System.out.println("Chua co sinh vien nao");
        } else {
            boolean search = false;
            for (Student st : students) {
                if (st.getMaSV().equals(mssv)) {
                    st.getMaSV();
                    st.showInfo();
                    search = true;
                }
            }
            if (search == false) {
                System.out.println("Khong tim thay mssv nay" + mssv);
            }
        }
    }

    public void hocBong() {
        for (Student st : students) {
            if (st.isHocBong()) {
                st.showInfo();
            }
        }
    }

    public void sort() {
        Collections.sort(students, new NameSort());
        students.forEach(Student::showInfo);
    }

    class NameSort implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.ten.compareTo(s2.ten);
        }
    }

    public void sortDiem() {
        Collections.sort(students, new DiemSort());
        students.forEach(Student::showInfo);
    }

    class DiemSort implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.getDiemTB() < s2.getDiemTB()) {
                return 1;
            } else {
                if (s1.getDiemTB() == s2.getDiemTB()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }
    }

    static void Menu() {
        System.out.println("-----------QUAN LI SINH VIEN-----------------");
        System.out.println("1.Nhap n sinh vien");
        System.out.println("2.Hien thi tat ca sinh vien");
        System.out.println("3.Sinh vien co diem TB cao nhat va thap nhat");
        System.out.println("4.Tim kiem sinh vien");
        System.out.println("5.Sap xep sinh vien theo ten");
        System.out.println("6.Sinh vien duoc hoc bong vaf sap xep sinh vien theo thu tu diem(cao->thap");
        System.out.println("7.Thoat");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        int ch;
        StudentTest studentTest = new StudentTest();
        Scanner sc = new Scanner(System.in);
        Menu();
        while (true) {

            System.out.print("Chon: ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Nhap so luong sinh vien: ");
                    int n = sc.nextInt();
                    studentTest.inputSinhvien(n);
                    break;
                case 2:
                    studentTest.outputSinhvien();
                    break;
                case 3:
                    studentTest.maxMin();
                    break;
                case 4:
                    System.out.println("Nhap mssv: ");
                    String mssv = sc.nextLine();
                    studentTest.searchStudent(mssv);
                    break;
                case 5:
                    studentTest.sort();
                    break;
                case 6:
                    System.out.println("Danh sach sinh vien hoc bong:");
                    studentTest.hocBong();
                    System.out.println("Danh sach sinh vien DTB giam dan:");
                    studentTest.sortDiem();
                    break;
                case 7:
                    return;
            }
        }

    }
}




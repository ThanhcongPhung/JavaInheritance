package Cau2;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String ten) {
        super(ten);
    }

    public Dog(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Dog(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }

    @Override
    public void tiengKeu(){
        System.out.println("Gau Gau");
    }}

package Cau2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String ten) {
        super(ten);
    }

    public Cat(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Cat(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meo Meo");
    }
}

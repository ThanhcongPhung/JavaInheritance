package Cau2;

public abstract class Animal {
    String Ten;
    int Tuoi;
    String MoTa;

    public Animal() {
    }

    public Animal(String ten) {
        this.Ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.Ten = ten;
        this.Tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String moTa) {
        this.Ten = ten;
        this.Tuoi = tuoi;
        this.MoTa = moTa;
    }

    public void xemThongTin() {
        System.out.println("Ten: " + Ten);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Mo ta: " + MoTa);
    }

    public abstract void tiengKeu();


}

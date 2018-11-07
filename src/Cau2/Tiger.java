package Cau2;

public class Tiger extends Animal{
    public Tiger() {
    }

    public Tiger(String ten) {
        super(ten);
    }

    public Tiger(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Tiger(String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
    }

    @Override
    public void tiengKeu(){
        System.out.println("Gru Gru");
    }
}

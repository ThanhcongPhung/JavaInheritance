package Cau2;

import java.util.ArrayList;

public class Chuong {
    String maChuong;

    public Chuong() {
    }
    public Chuong(String maChuong){
        this.maChuong=maChuong;
    }
    ArrayList<Animal> AnimalLists = new ArrayList<>();

    public void themConVat(Animal a) {
        AnimalLists.add(a);
        System.out.println("Them thanh cong");
    }

    public void xoaConVat(String ten) {
        for (Animal animal : AnimalLists) {
            if (animal.Ten.equals(ten)) {
                AnimalLists.remove(ten);
                System.out.printf("Da xoa con vat %s\n", ten);
                break;
            }
        }
    }
    public void xemConVat(){
        for(Animal animal:AnimalLists){
            animal.xemThongTin();
            animal.tiengKeu();
        }
    }
}

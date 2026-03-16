package ExerciciosConceituais.array_ArrayList_Colecoes;

import ExerciciosConceituais.array_ArrayList_Colecoes.entities.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args){
        Smartphone s1 = new Smartphone("1abc1", "iPhone");
        Smartphone s2 = new Smartphone("12333", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Motorola");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("222222", "tecpix");
        System.out.println(smartphones.contains(s4));
    }
}

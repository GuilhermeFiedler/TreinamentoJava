package ExerciciosConceituais.array_ArrayList_Colecoes;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList<>(1);
        List nomes2 = new ArrayList<>(1); // array que pode ser aumentado.
        nomes.add("teste");
        nomes.add("testando");
        nomes.remove("testando");

        nomes2.add("sim");
        nomes2.add("ata");

        nomes.addAll(nomes2);

        for(Object nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Suane");
        System.out.println("-----");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }


}

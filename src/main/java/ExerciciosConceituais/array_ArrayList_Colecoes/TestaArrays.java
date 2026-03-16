package ExerciciosConceituais.array_ArrayList_Colecoes;

public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10]; // array de contas com 10 de tamanho.

        for (int i = 0; i < contas.length; i++) {
            double saldo = i * 100; //gera saldos distintos
            contas[i] = new Conta(saldo);
        }
        int indice = 0;
        for (Conta x : contas){
            System.out.println("Saldo da conta: " + indice + " = "+ x.getSaldo());
            indice++;
        }
        System.out.println("indice é de :" + indice);
        double soma = 0;
        for (Conta x : contas){
            soma += x.getSaldo();
        }

        double mediaFinal = soma / indice;
        System.out.println("A media é de : " + mediaFinal);
    }
}

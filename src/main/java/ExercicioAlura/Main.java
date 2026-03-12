package ExercicioAlura;
//Exercício da Apostila cap.4 com intuito de revisar: Classes, métodos, objeto, return, instanciação, referências de objeto
// Apostila cap 5, aborda modificadores de acesso, encapsulamento.
public class Main {
    public static void main(String[] args) {

        Conta outraConta = new Conta();
        outraConta.deposita(400);

        String clone = "Clone";
        Conta minhaConta = new Conta(clone);

        minhaConta.dataDeAbertura = new DataCriacao();

        outraConta.dataDeAbertura = new DataCriacao(12, 3, 2026);

        minhaConta.deposita(1000);
        minhaConta.agencia = "Banco do Brasil";
        //System.out.println("Saldo da minha Conta: " + minhaConta.pegaSaldo());
        System.out.println(minhaConta);
        System.out.println(outraConta);

        System.out.println("--------------------");
        System.out.println("Transferindo saldo...");
        minhaConta.transferePara(outraConta, 50);
        System.out.println("Saldos agora: " + minhaConta.getSaldo() + ", e " + outraConta.getSaldo());

        }
    }
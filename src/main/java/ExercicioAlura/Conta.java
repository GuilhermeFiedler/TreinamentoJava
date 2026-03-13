package ExercicioAlura;
//A classe Conta deve conter, os seguintes métodos:
//saca que recebe um valor como parâmetro e o retira do saldo da conta;
//deposita que recebe um valor como parâmetro e o adiciona ao saldo da conta;
//calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1.

public class Conta {
    public int numero;
    public String titular;
    public String agencia;
    private double saldo;
    DataCriacao dataDeAbertura;

    //Q6 e Q7 - Crie uma classe para representar a Data de criação e use-a.
    //construtor padrão
    Conta(){
    }
    //construtor parametrizado
    public Conta(String titular){
        //inicializações e configurações
        this.titular = titular;
        dataDeAbertura = new DataCriacao();
    }


    public Conta(int numero, String titular){
        this(titular);
        this.numero = numero;
    }


    public double pegaSaldo(){
        return this.saldo;
    }

    //sacar dinheiro
    public boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    //depositar dinheiro
    public void deposita(double quantidade){
        this.saldo += quantidade;
    }
    //calcular rendimento
    public double calculaRendimento(){
      double renda = this.saldo;
      renda *= 0.1;
      return renda;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // método de transferência de saldo
    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (!retirou) {
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

    // Q3 - Crie um método para retornar informações da conta.
    @Override
    public String toString() {
        return "Conta{Titular='" + titular + "', saldo=" + saldo + "', Agência=" + agencia + ", Rendimento= " + calculaRendimento() + "Data de Criação: " + dataDeAbertura.dia + "/" + dataDeAbertura.mes + "/" + dataDeAbertura.ano + "}";
    }



}
class DataCriacao {
    int dia, mes, ano;

    public DataCriacao(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public DataCriacao() {
        this.dia  = 1;
        this.mes  = 1;
        this.ano = 2026;
    }
}



package POO.Aula20.conta02_Composicao;

public class ContaPoupanca {
    private Conta conta;

    public ContaPoupanca(String numero) {
        conta = new Conta(numero);
    }

    public void depositarNaConta(double valor){
        conta.deposita(valor);
    }

    public void deposita(double valor) {
        conta.deposita(valor);
    }

    public boolean saca(double valor) {
        double valorASacar = valor - 0.01;
        return conta.saca(valorASacar);
    }

    public boolean transfere(double valor, Conta contaDestino) {
        return conta.transfere(valor, contaDestino);
    }

    public double getSaldo() {
        return conta.getSaldo();
    }

    public String getNumero() {
        return conta.getNumero();
    }
}

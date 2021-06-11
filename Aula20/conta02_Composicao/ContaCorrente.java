package POO.Aula20.conta02_Composicao;

public class ContaCorrente {
    private Conta conta;

    public ContaCorrente(String numero){
        conta = new Conta(numero);
    }

    public void deposita(double valor) {
        conta.deposita(valor);
    }

    public boolean saca(double valor) {
        return conta.saca(valor);
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

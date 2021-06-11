package POO.Aula20.conta06_composicao_e_interface;


public class ContaCorrente implements Conta {
    private ContaPadrao conta;

    public ContaCorrente(String numero){
        conta = new ContaPadrao(numero);
    }

    @Override
    public void deposita(double valor) {
        conta.deposita(valor);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor - 0.01;
        return conta.saca(valor);
    }

    public boolean transfere(double valor, Conta contaDestino) {
        return conta.tranfere(valor, contaDestino);
    }

    @Override
    public double saldo() {
        return conta.getSaldo();
    }

    @Override
    public String numero() {
        return conta.getNumero();
    }
}

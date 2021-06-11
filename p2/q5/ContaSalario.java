package POO.p2.q5;


public class ContaSalario implements Conta {
    private ContaPadrao conta;

    public ContaSalario(String numero){
        conta = new ContaPadrao(numero);
    }

    @Override
    public void deposita(double valor) {
        conta.deposita(valor);
    }

    @Override
    public boolean saca(double valor) {
        return conta.saca(valor);
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

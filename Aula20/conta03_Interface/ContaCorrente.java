package POO.Aula20.conta03_Interface;

public class ContaCorrente implements Conta {
    private double saldo;
    private String numero;

    public ContaCorrente(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        if(saldo>=valor){
            saldo-=valor-0.01;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfere(double valor, Conta conta) {
        if(saca(valor)){
            conta.deposita(valor);;
            return true;
        }
        return false;
    }

    @Override
    public double saldo() {
        return saldo;
    }

    @Override
    public String numero() {
        return numero;
    }
}

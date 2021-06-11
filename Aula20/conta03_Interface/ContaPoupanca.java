package POO.Aula20.conta03_Interface;

public class ContaPoupanca implements Conta {
    private double saldo;
    private String numero;

    public ContaPoupanca(double saldo, String numero) {
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
            saldo-=valor;
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

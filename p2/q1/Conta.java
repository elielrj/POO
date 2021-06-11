package POO.p2.q1;

public class Conta {

    private float saldo;


    public Conta() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public boolean sacar(float valor){
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean transferir(float valor, Conta conta2) {
        if(this.sacar(valor)){
            conta2.depositar(valor);
            return true;
        }
        return false;

    }
}

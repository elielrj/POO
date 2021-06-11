package POO.Aula03.exercicio03.conta;

public class Conta {
    private float saldo;

    public Conta() {
        saldo = 0;
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

package POO.Aula20.conta02_Composicao;

public class Conta {
    private double saldo;
    private String numero;

    public Conta(String numero) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta contaDestino){
        if(saca(valor)){
            contaDestino.deposita(valor);;
            return true;
        }
        return false;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNumero(){
        return numero;
    }
}

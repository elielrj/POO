package POO.p2.q4;

public class ContaPadrao {
    private double saldo;
    private String numero;

    public ContaPadrao(String numero) {
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

    public boolean tranfere(double valor, Conta contaDestino){
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

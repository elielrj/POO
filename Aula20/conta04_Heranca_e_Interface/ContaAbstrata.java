package POO.Aula20.conta04_Heranca_e_Interface;

public abstract class ContaAbstrata implements Conta{
    private double saldo;
    private String numero;

    public ContaAbstrata(String numero) {
        this.numero = numero;
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
    }

    @Override
    public boolean saca(double valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfere(double valor, Conta contaDestino){
        if(saca(valor)){
            contaDestino.deposita(valor);;
            return true;
        }
        return false;
    }
    @Override
    public double saldo(){
        return saldo;
    }

    @Override
    public String numero(){
        return numero;
    }
}

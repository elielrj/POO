package POO.Aula20.conta01Heranca;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numero){
        super(numero);
    }

    @Override
    public boolean saca(double valor){
        double valorASacar = valor - 0.01;
        return super.saca(valorASacar);
    }
}

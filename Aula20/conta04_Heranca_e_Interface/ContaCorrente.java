package POO.Aula20.conta04_Heranca_e_Interface;



public class ContaCorrente extends ContaAbstrata{
    public ContaCorrente(String numero){
        super(numero);
    }

    @Override
    public boolean saca(double valor){
        double valorASacar = valor - 0.01;
        return super.saca(valorASacar);
    }
}

package POO.Aula20.conta04_Heranca_e_Interface;

public class ContaPoupanca extends ContaAbstrata {
    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor);
    }
}

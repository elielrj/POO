package POO.p2.q1;



public class Corrente extends Conta  {
    private float taxaDeDesconto = 0.01f;


    public Corrente() {
        super();
    }

    @Override
    public boolean sacar(float valor) {
        if (super.getSaldo() >= valor) {
            super.sacar((valor+taxaDeDesconto));
            return true;
        }
        return false;
    }
}
package POO.p2.q3;

public class Normal extends Fita {
    private double valor = 2;

    public Normal(String titulo) {
        super(titulo, "normal", 1);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public double valor(int diasAlugada) {
        if (diasAlugada > 2 ) {
            valor += (diasAlugada - 2 ) * 1.5 ;
        }
        return valor;
    }
}

package POO.p2.q3;

public class Infantil extends Fita {
    private double valor = 1.5;

    public Infantil(String titulo) {
        super(titulo, "infantil", 1);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public double valor(int diasAlugada) {
        if (diasAlugada > 3 ) {
            valor += (diasAlugada - 3 ) * 1.5 ;
        }
        return valor;
    }
}

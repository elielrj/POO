package POO.p2.q3;

public class Lancamento extends Fita {
    private double valor;

    public Lancamento(String titulo) {
        super(titulo, "lancamento", 2);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public double valor(int diasAlugada) {
        valor = diasAlugada * 3 ;
        return valor;
    }
}

package POO.p2.q3;

public class Locacao {

    private Fita fita;
    private int diasAlugada;

    public Locacao(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public String getFita() {
        String s = "\t" + fita.getTitulo() + "\t" + fita.valor(diasAlugada) + "\n";
        return s;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double valorDaFita(){
        return fita.valor(diasAlugada);
    }


    public int potosDaFita() {
        return fita.getPonto();
    }
}


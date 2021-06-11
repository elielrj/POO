package POO.p2.q3;

public abstract class Fita {

    private String titulo;
    private final String tipo;
    private final int ponto;



    public Fita(String titulo, String tipo, int ponto) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.ponto = ponto;
    }

    public final int getPonto() {
        return ponto;
    }

    public final String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double valor(int diasAlugada);


}

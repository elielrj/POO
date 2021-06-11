package POO.Aula14.exercicioRevisao01Series;

public class Episodio {
    private String titulo;
    private  Temporada temporada;

    private boolean visualizado;

    public Episodio(String titulo, Temporada temporada) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.visualizado = false;
    }

    public void marcarComoVisualizado(){
        this.visualizado = true;
    }

    public String titulo(){
        return this.titulo;
    }

    public int numeroDaTemporada(){
        return temporada.numero();
    }

    public boolean foiVisualizado(){
        return visualizado;
    }
}

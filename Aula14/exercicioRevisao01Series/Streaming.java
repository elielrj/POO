package POO.Aula14.exercicioRevisao01Series;

import java.util.ArrayList;

public class Streaming {
    private String nome;
    private ArrayList<Serie> series;

    public Streaming(String nome) {
        this.nome = nome;
        this.series = new ArrayList<>();
    }


    public Serie adicionarSerie(String titulo) {
        Serie serie = new Serie(titulo);
        this.series.add((serie));
        return serie;
    }

    public int quantidade() {
        return this.series.size();
    }
}

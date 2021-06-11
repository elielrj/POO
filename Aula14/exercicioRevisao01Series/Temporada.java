package POO.Aula14.exercicioRevisao01Series;

import java.util.ArrayList;

public class Temporada {
    private int numero;
    private int ano;

    private Serie serie;

    private ArrayList<Episodio> episodios;

    public Temporada(int numero, int ano, Serie serie) {
        this.numero = numero;
        this.ano = ano;
        this.serie = serie;
        this.episodios = new ArrayList<>();
    }

    public int numero() {
        return this.numero;
    }


    public String tituloDaSerie() {
        return serie.titulo();
    }

    public void cadastrar(Episodio episodio){
        episodios.add(episodio);
    }

    public Episodio cadastrar(String titulo){
        Episodio episodio = new Episodio(titulo, this);
        this.episodios.add(episodio);
        return episodio;
    }

    public int quantidadeDeEpisodios(){
        return this.episodios.size();
    }

    public boolean foiConcluida(){
        for(Episodio episodio: episodios){
            if(!episodio.foiVisualizado())
                return false;
        }
        return true;
    }

    public void marcarComoConcluida(){
        for(Episodio episodio: episodios){
            episodio.marcarComoVisualizado();
        }
    }
}

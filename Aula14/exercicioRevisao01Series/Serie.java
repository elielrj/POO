package POO.Aula14.exercicioRevisao01Series;

import java.util.ArrayList;

public class Serie {
    private String titulo;

    private ArrayList<Temporada> temporadas;
    public Serie(String titulo) {
        this.titulo = titulo;
        this.temporadas = new ArrayList();
    }

    public String titulo() {
        return titulo;
    }
    public void cadastrar(Temporada temporada){
        this.temporadas.add(temporada);
    }

    public int quantidadeDeTemporadas(){
        return this.temporadas.size();
    }

    public Temporada cadastrar(int numero, int ano){
        Temporada temporada = new Temporada(numero, ano, this);
        temporadas.add(temporada);
        return temporada;
    }
    public boolean foiVisualizada(){
        for(Temporada temporada: temporadas){
            if(!temporada.foiConcluida()){
                return false;
            }
        }
        return true;
    }

    public void marcaComoCOncluida(){
        for(Temporada temporada: temporadas){
            temporada.marcarComoConcluida();
        }
    }
}

package POO.Aula07.exercicioCanal.meu;

import java.util.ArrayList;

public class ListaDeVideos {
    private ArrayList<Video> listaDeVideos;


    public ListaDeVideos() {
        listaDeVideos = new ArrayList<>();
    }

    public void adicionar(Video video) {

        listaDeVideos.add(video);


    }

    public int quantidade() {
        return listaDeVideos.size();
    }

    public void limpar() {
        listaDeVideos.clear();
    }

    public float duracaoTotal() {
        float duracao = 0;
        for(Video video: listaDeVideos){
            duracao += video.duracao();
        }
        return duracao;
    }

    public boolean estaVazia() {
        if(listaDeVideos == null)
            return true;
        else
            return false;
    }

    public void remover(Video video) {

        for (Video s: listaDeVideos){
            if (s == video)
                listaDeVideos.remove(s);
        }
    }

}

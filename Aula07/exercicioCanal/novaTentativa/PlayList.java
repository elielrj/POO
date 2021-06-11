package POO.Aula07.exercicioCanal.novaTentativa;

import java.util.ArrayList;

public class PlayList {
    private String nome;
    private Canal canal;
    private ArrayList<Video> listaDeVideos;

    public PlayList(String nome) {
        this.nome = nome;
        listaDeVideos = new ArrayList<>();
    }

    public void adicionar(Video video){
        listaDeVideos.add(video);
    }

    public int quantidadeDeVideos(){
        return listaDeVideos.size();
    }

    public void limparPlayList(){
        listaDeVideos.clear();
    }

    public String nome() {
        return nome;
    }

    public float duracaoTotal() {
        float total = 0;
        for(Video video: listaDeVideos){
            total += video.duracao();
        }
        return total;
    }

    public boolean estaVazia() {
        if(listaDeVideos.size() > 0)
            return false;
        return true;
    }




}

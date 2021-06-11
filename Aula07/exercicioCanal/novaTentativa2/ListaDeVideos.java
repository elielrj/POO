package POO.Aula07.exercicioCanal.novaTentativa2;


import java.util.ArrayList;

public class ListaDeVideos {

    private ArrayList<Video> videos;


    public ListaDeVideos() {
        this.videos = new ArrayList<>();
    }

    public void adicionar(Video video) {
        videos.add(video);
    }

    public int quantidade() {
        return videos.size();
    }

    public void limpar() {
        videos.clear();
    }

    public float duracaoTotal() {
        float duracao = 0;
        for(Video video: videos){
            duracao += video.duracao();
        }
        return duracao;
    }

    public boolean estaVazia() {
        if(quantidade() == 0 ){
            return true;
        }else{
            return false;
        }
    }

    public void remover(Video video) {
        videos.remove(video);
    }
}

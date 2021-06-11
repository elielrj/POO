package POO.Aula07.exercicioCanal.novaTentativa;

import java.util.ArrayList;

public class ListaDeVideos {
    private ArrayList<Video> videos;

    public ListaDeVideos() {
        videos = new ArrayList<>();
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
        float total = 0;

        for(Video video: videos){
            total += video.duracao();
        }

        return total;
    }

    public boolean estaVazia() {
        if (videos.size() > 0)
            return false;
        return true;
    }

    public void remover(Video video) {
        videos.remove(video);
    }
}

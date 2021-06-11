package POO.Aula07.exercicioCanal.colega;
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
        float tempo = 0;
        for(Video video: videos){
            tempo += video.duracao();
        }
        return tempo;
    }
    public boolean estaVazia() {
        if(videos == null){
            return true;
        }
        return  false;
    }
    public void remover(Video video) {
        videos.remove(video);
    }
}
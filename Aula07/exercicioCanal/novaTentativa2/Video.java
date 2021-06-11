package POO.Aula07.exercicioCanal.novaTentativa2;

import java.util.ArrayList;

public class Video {

    private String titulo;
    private float duracao;
    private Canal canal;
    private ArrayList<PlayList> playLists;

    public Video(String titulo, float duracao, Canal canal) {
        this.titulo = titulo;
        duracao = duracao;
        setCanal(canal);
        this.playLists = new ArrayList<>();
    }


    public void salvarNaPlaylist(PlayList playList) {
        playLists.add(playList);
    }

    public float duracao() {
        return duracao;
    }

    public String titulo() {
        return titulo;
    }

    public String obterNomeDoCanal() {
        return canal.nome();
    }
    public Canal obterCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}

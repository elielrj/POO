package POO.Aula07.exercicioCanal.meu;

public class Video {
    private String titulo;
    private float duracao;
    private Canal canal;

    public Video(String titulo, float duracao, Canal canal) {
        this.titulo = titulo;
        this.duracao = duracao;
        setCanal(canal);
    }

    public void salvarNaPlaylist(PlayList playList) {
        playList.adicionar(this);
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
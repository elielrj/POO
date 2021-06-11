package POO.Aula07.exercicioCanal.colega;

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
        return this.duracao;
    }

    public String titulo() {
        return this.titulo;
    }

    public String obterNomeDoCanal() {
        return this.canal.nome();
    }

    public Canal obterCanal() {
        return this.canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
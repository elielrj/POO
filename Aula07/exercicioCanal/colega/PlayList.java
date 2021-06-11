package POO.Aula07.exercicioCanal.colega;

public class PlayList {

    private String nome;
    private ListaDeVideos listaDeVideos;

    public PlayList(String nome) {
        this.nome = nome;
        listaDeVideos = new ListaDeVideos();
    }

    public void adicionar(Video video){
        listaDeVideos.adicionar(video);
    }

    public int quantidadeDeVideos(){
        return listaDeVideos.quantidade();
    }

    public void limparPlayList(){
        listaDeVideos.limpar();
    }

    public String nome() {
        return this.nome;
    }

    public float duracaoTotal() {
        return this.listaDeVideos.duracaoTotal();
    }

    public boolean estaVazia() {
        return this.listaDeVideos.estaVazia();
    }
}

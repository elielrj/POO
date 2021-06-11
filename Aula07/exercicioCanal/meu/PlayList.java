package POO.Aula07.exercicioCanal.meu;

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
        return nome;
    }

    public float duracaoTotal() {
        return listaDeVideos.duracaoTotal();
    }

    public boolean estaVazia() {
        return listaDeVideos.estaVazia();
    }
}

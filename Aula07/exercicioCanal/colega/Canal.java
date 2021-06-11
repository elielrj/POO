package POO.Aula07.exercicioCanal.colega;
import java.util.ArrayList;

public class Canal {

    private String nome;
    private ListaDeVideos listaDeVideos;
    private ArrayList<PlayList> playLists;


    public Canal(String nome) {
        this.nome = nome;
        this.playLists = new ArrayList<>();
        this.listaDeVideos = new ListaDeVideos();
    }

    public void criarPlayList(String nome){
        PlayList playList = new PlayList(nome);
        this.playLists.add(playList);
    }
    
    public void removerPlayList(PlayList playList){
        this.playLists.remove(playList);
    }

    public int quantidadeDeVideos(){
        return this.listaDeVideos.quantidade();
    }

    public void adicionar(Video video){
        this.listaDeVideos.adicionar(video);
        video.setCanal(video.obterCanal());
    }
    public void remover(Video video) {
        this.listaDeVideos.remover(video);
    }

    public ArrayList<String> listarPlayLists(){
        ArrayList<String> nomesDasListas = new ArrayList<>();
        for(PlayList playList: playLists){
            nomesDasListas.add(playList.nome());
        }
        return nomesDasListas;
    }
    public PlayList buscarPlayList(String nome) {
        for(PlayList playList: playLists){
            if(playList.nome().equalsIgnoreCase(nome)){
                return playList;
            }
        }
        return null;
    }
    public int quantidadeDePlaylists() {
        return this.playLists.size();
    }
    public float duracaoTotalDosVideos() {
        return this.listaDeVideos.duracaoTotal();
    }
    public float duracaoMediaDasPlayLists() {
        float total = 0;
        for(PlayList playList: playLists){
            total += playList.duracaoTotal();
        }
        return (total/playLists.size());
    }
    public String nome() {
        return this.nome;
    }
}

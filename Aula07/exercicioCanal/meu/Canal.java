package POO.Aula07.exercicioCanal.meu;
import java.util.ArrayList;

public class Canal {

    private String nome;
    private ListaDeVideos listaDeVideos;
    private ArrayList<PlayList> playLists;


    public Canal(String nome) {
        this.nome = nome;
        playLists = new ArrayList<>();
        listaDeVideos = new ListaDeVideos();
    }

    public void criarPlayList(String nome){
        PlayList s = new PlayList(nome);
        playLists.add(s);
    }

    public void removerPlayList(PlayList playList){

        playLists.remove(playList);
    }

    public int quantidadeDeVideos(){
        int quantidadeDeVideosDeUmCanal = 0;

        for(PlayList lista: playLists){
            quantidadeDeVideosDeUmCanal += lista.quantidadeDeVideos();
        }
        return quantidadeDeVideosDeUmCanal;
    }

    public void adicionar(Video video){

        remover(video);

        this.listaDeVideos.adicionar(video);
        video.setCanal(this);



    }

    public void remover(Video video) {

        listaDeVideos.remover(video);
        playLists.remove(video);

    }


    public ArrayList<String> listarPlayLists(){
        ArrayList<String> lista = new ArrayList<>();
        for(PlayList playList: playLists){
            lista.add(playList.nome());
        }
        return lista;
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
        return playLists.size();
    }

    public float duracaoTotalDosVideos() {
        float duracaoTotalDosVideos = 0;

        for(PlayList x: playLists){
            duracaoTotalDosVideos += x.duracaoTotal();
        }
        return duracaoTotalDosVideos;
    }

    public float duracaoMediaDasPlayLists() {
        float duracaoMedia = 0;
        for(PlayList playList: playLists){
            duracaoMedia += playList.duracaoTotal();
        }
        return duracaoMedia/playLists.size();
    }

    public String nome() {
        return nome;
    }
}

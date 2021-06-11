package POO.Aula07.exercicioCanal.novaTentativa;

import java.util.ArrayList;

public class Canal {
    private String nome;
    private ArrayList<PlayList> playLists;
    private ArrayList<Video> videos;

    public Canal(String nome) {
        this.nome = nome;
        playLists = new ArrayList<>();
        videos = new ArrayList<>();
    }

    public void criarPlayList(String nome){
        playLists.add(new PlayList(nome));
    }

    public void removerPlayList(PlayList playList){
        playLists.remove(playList);
    }

    public int quantidadeDeVideos(){
        return videos.size();
    }

    public void adicionar(Video video){

        Canal temp = video.obterCanal();

        for(PlayList lista: temp.playLists){
            removerPlayList(lista);
        }

        for(Video v: temp.videos) {
            remover(v);
        }

        videos.add(video);
    }

    public void remover(Video video) {
        videos.remove(video);
    }


    public ArrayList<String> listarPlayLists(){
        ArrayList<String> lista = new ArrayList<>();

        for(PlayList playlist: playLists){
            lista.add(playlist.nome());
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

        for(Video video: videos){
            duracaoTotalDosVideos += video.duracao();
        }
        return duracaoTotalDosVideos;
    }

    public float duracaoMediaDasPlayLists() {
        float duracao = 0;

        for(PlayList lista: playLists){
            duracao += lista.duracaoTotal();
        }
        return duracao/ quantidadeDePlaylists();
    }

    public String nome() {
        return nome;
    }
}

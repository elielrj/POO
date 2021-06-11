package POO.Aula07.exercicioCanal.novaTentativa2;


import java.util.ArrayList;

public class Canal {

    private String nome;
    private ArrayList<Video> videos;
    private ArrayList<PlayList> playLists;


    public Canal(String nome) {
        this.nome = nome;
        this.videos = new ArrayList<>();
        this.playLists = new ArrayList<>();
    }

    public void criarPlayList(String nome){
        PlayList playList = new PlayList(nome);
        playLists.add(playList);
    }

    public void removerPlayList(PlayList playList){
        playLists.remove(playList);
    }

    public int quantidadeDeVideos(){
        return videos.size();
    }

    public void adicionar(Video video){
        //remover(video);
        //video.setCanal(this);
        videos.add(video);
    }

    public void remover(Video video) {
        videos.remove(video);
    }


    public ArrayList<String> listarPlayLists(){
        ArrayList<String> nomeDasPlayLists = new ArrayList<>();
        for(PlayList playList: playLists){
            nomeDasPlayLists.add(playList.nome());
        }
        return nomeDasPlayLists;
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
        return  playLists.size();
    }

    public float duracaoTotalDosVideos() {
        return videos.size();
    }

    public float duracaoMediaDasPlayLists() {
        float duracao = 0;
        for(PlayList playList: playLists){
            duracao += playList.duracaoTotal();
        }
        return duracao/quantidadeDePlaylists();
    }

    public String nome() {
        return nome;
    }
}

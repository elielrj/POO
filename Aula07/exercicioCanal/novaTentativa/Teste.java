package POO.Aula07.exercicioCanal.novaTentativa;

public class Teste {

    public static void main(String[] args) {

        // Instanciar canal
        Canal canal1 = new Canal("Meu canal1");
        Canal canal2 = new Canal("Meu canal2");

        // Instanciar vídeo. Um vídeo deve ser sempre de um canal, somente 1 canal
        Video video1 = new Video("Vídeo 1", 15.00f, canal1);
        Video video2 = new Video("Vídeo 2", 10.00f, canal1);
        Video video3 = new Video("Vídeo 3", 13.00f, canal1);
        Video video4 = new Video("Vídeo 4", 12.00f, canal1);

        // Um vídeo não pode fazer parte de mais de um canal. Dessa forma, a instrução abaixo
        // transfere o video 1 para o canal 2
        canal2.adicionar(video1);



        // Um canal pode ter várias playlists e uma
        canal1.criarPlayList("Playlist 1");
        canal1.criarPlayList("Playlist 2");
        canal1.criarPlayList("Playlist 3");


        // Listando o nome das playlists do canal 1
        for(String s:canal1.listarPlayLists()){
            System.out.println(s);
        }


        // buscando a playlist pelo nome
        PlayList playList = canal1.buscarPlayList("Playlist 1");
        if(playList == null){
            System.out.println("não encontrada");
        }

        // video 1 adicionando-SE na playlist 'Playlist 1'
        video1.salvarNaPlaylist(playList);

        // Uma playlist pode ter vários vídeos (ou nenhum)
        playList.adicionar(video2);

        PlayList playList2 = canal1.buscarPlayList("Playlist 2");
        if(playList == null){
            System.out.println("não encontrada");
        }
        video3.salvarNaPlaylist(playList2);

        PlayList playList3 = canal1.buscarPlayList("Playlist 3");
        if(playList == null){
            System.out.println("não encontrada");
        }
        // video 4 adicionando-SE na playlist 'Playlist 3' e playlist 'Playlist 4'
        // Um vídeo pode fazer parte de várias playlists
        video4.salvarNaPlaylist(playList3);
        video4.salvarNaPlaylist(playList2);

        //canal1.removerPlayList(playList3);

        //Relatórios:
        System.out.println("Nome do canal do vídeo 1: " + video1.obterNomeDoCanal());
        System.out.println("Nome do canal do vídeo 2: " + video2.obterNomeDoCanal());
        System.out.println("Quantidade de vídeos do canal1:" + canal1.quantidadeDeVideos());
        System.out.println("Quantidade de vídeos do canal2:" + canal2.quantidadeDeVideos());
        System.out.println("Quantidade de playlists do canal1:" + canal1.quantidadeDePlaylists());
        System.out.println("Quantidade de vídeos na playlist 'PlayList 1':" + playList.quantidadeDeVideos());
        System.out.println("Duração total dos vídeos do canal1:" + canal1.duracaoTotalDosVideos());
        System.out.println("Duração média das playlists:" + canal1.duracaoMediaDasPlayLists());
        System.out.println("Duração total dos vídeos da playlist 'PlayList 1':" + playList.duracaoTotal());


    }
}

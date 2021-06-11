package POO.Aula15.cd;

import java.util.ArrayList;

public class CD {
    private ArrayList<Musica> musicas;

    public CD(){
        musicas = new ArrayList<>();
    }

    public void adicionar(Musica musica){
        musicas.add(musica);
    }

    public int quantidadeDeMusicas(){
        return musicas.size();
    }

    public float duracaoTotal(){
        float total = 0;
        for (Musica musica : musicas) {
            total = total + musica.getDuracao();
        }
        return total;
    }

    public float duracaoMediaDasMusicas(){
        return duracaoTotal() / quantidadeDeMusicas();
    }









}

package POO.Aula05.cd2;

import java.util.ArrayList;

public class ListaDeMusicas {
    private ArrayList<Musica> musicas;

    public ListaDeMusicas(){
        musicas = new ArrayList<>();
    }

    public void adicionar(Musica musica) {
        musicas.add(musica);
    }

    public int quantidade() {
        return musicas.size();
    }

    public float duracaoTotal() {
        float total = 0;
        for(Musica musica:musicas){
            total+=musica.getDuracao();
        }
        return total;
    }
}

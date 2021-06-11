package POO.p1.q12;

import java.util.ArrayList;

public class ListaDeMusicas {
    private ArrayList<Musica> musicas;

    public ListaDeMusicas(){
        musicas = new ArrayList<>();
    }

    public void adicionar(Musica musica) {
        musicas.add(musica);

    }

    public void remover(String musica){
        for(Musica s: musicas){
            if(s.getNome().equalsIgnoreCase(musica)){
                musicas.remove(s);
                return;
            }
        }

    }

    public int quantidade() {
        return musicas.size();
    }

    public int quantidadeDeMusicasIguais(String musica){
        int i = 0;
        for(Musica s: musicas){
            if(s.getNome().equalsIgnoreCase(musica)){
                i++;
            }
        }
        return i;
    }
    public float duracaoTotal() {
        float total = 0;
        for(Musica musica:musicas){
            total+=musica.getDuracao();
        }
        return total;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }


}

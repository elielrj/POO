package POO.p1.q12;

public class CD {
    private String nome;
    private ListaDeMusicas listaDeMusicas;

    public CD(String nome){
        this.nome = nome;
        listaDeMusicas = new ListaDeMusicas();
    }

    public void adicionar(Musica musica){
        listaDeMusicas.adicionar(musica);
    }

    public int quantidadeDeMusicas(){
        return listaDeMusicas.quantidade();
    }

    public float duracaoTotal(){
        return listaDeMusicas.duracaoTotal();
    }


    public boolean igualMusica(String nomeMusica){
        for(Musica musicaa: listaDeMusicas.getMusicas()){
            if(musicaa.getNome().equalsIgnoreCase(nomeMusica)){
                return true;
            }
        }
        return false;
    }
    public void removerMusica(String musica){

        listaDeMusicas.remover(musica);
    }

    public void imprimeListaDeMusicas() {
        for(Musica musica: listaDeMusicas.getMusicas()){
            System.out.println(musica.getNome());
        }
    }

    public int quantidadeDeMusicasIguais(String musica){
        return listaDeMusicas.quantidadeDeMusicasIguais(musica);
    }

    public String getNomeCD() {
        return nome;
    }

    public ListaDeMusicas getListaDeMusicas() {
        return listaDeMusicas;
    }
}

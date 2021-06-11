package POO.Aula05.cd2;

public class CD {
    private ListaDeMusicas listaDeMusicas;

    public CD(){
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

    public float duracaoMediaDasMusicas(){
        return
                listaDeMusicas.duracaoTotal() /
                        listaDeMusicas.quantidade();
    }
}

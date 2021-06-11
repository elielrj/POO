package POO.Aula14.exercicioRevisao01Series;

public class Teste {
    public static void main(String[] args) {
        Streaming netFlex = new Streaming("NetFlex");

        Serie serie1 = netFlex.adicionarSerie("Titulo da Série");
        Serie serie2 = netFlex.adicionarSerie("Titulo da Série");
        Serie serie3= netFlex.adicionarSerie("Titulo da Série");


        Temporada temporada1 = serie1.cadastrar(1, 2019);
        Temporada temporada2 = serie1.cadastrar(2, 2019);

        Temporada temporada3 = serie2.cadastrar(1, 2019);

        temporada1.cadastrar("Titulo do episódio1");
        temporada1.cadastrar("Titulo do episódio2");
        temporada1.cadastrar("Titulo do episódio3");
        temporada2.cadastrar("Titulo do episódio");
        Episodio episodio1 = temporada3.cadastrar("Titulo de episodio");


        System.out.println("Quantidade de Séries: " + netFlex.quantidade());
        System.out.println("Quantidade de temporadas: " + serie1.quantidadeDeTemporadas());
        System.out.println("Quantidade de episodios: " + temporada1.quantidadeDeEpisodios());

        episodio1.marcarComoVisualizado();


        System.out.println("Temporada 3:" + temporada3.foiConcluida());

        temporada1.marcarComoConcluida();
        temporada2.marcarComoConcluida();

        System.out.println(serie1.foiVisualizada());
    }
}

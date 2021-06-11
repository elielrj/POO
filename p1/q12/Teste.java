package POO.p1.q12;

public class Teste {
    public static void main(String[] args) {
        Musica m1 = new Musica("Música a", 3);
        Musica m2 = new Musica("Música b", 3);
        Musica m3 = new Musica("Música c", 3);
        Musica m4 = new Musica("Música d", 3);
        Musica m5 = new Musica("Música e", 3);

        CD cd1 = new CD("cd a");
        CD cd2 = new CD("cd b");
        CD cd3 = new CD("cd c");

        cd1.adicionar(m1);
        cd1.adicionar(m2);
        cd1.adicionar(m3);
        cd1.adicionar(m4);
        cd2.adicionar(m5);
        cd3.adicionar(m1);

        ListaDeCds listaUnica = new ListaDeCds();

        listaUnica.adicionar(cd1);
        listaUnica.adicionar(cd2);
        listaUnica.adicionar(cd3);

        System.out.println("Lista CD 1:");
        cd1.imprimeListaDeMusicas();
        System.out.println("");

        System.out.println("Lista CD 2:");
        cd2.imprimeListaDeMusicas();
        System.out.println("");

        System.out.println("Lista CD 3:");
        cd3.imprimeListaDeMusicas();
        System.out.println("");

        System.out.println("CDs Associados a \"Música a\":");
        listaUnica.listarCDSAssociadosUmaMusica("Música a");




    }


}

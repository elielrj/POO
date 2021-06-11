package POO.Aula15.cd;

public class Teste {
    public static void main(String[] args) {
        Musica xx = new Musica("xx", 5);
        Musica yy = new Musica("yy", 3);
        CD cd = new CD();

        cd.adicionar(xx);
        cd.adicionar(yy);
        System.out.println(cd.quantidadeDeMusicas());
        System.out.println(cd.duracaoTotal());
        System.out.println(cd.duracaoMediaDasMusicas());

    }
}

package POO.Aula06.exercicio04Jogador;

public class Teste {
    public static void main(String[] args) {
        Time fla = new Time("Fla");

        Jogador zico = new Jogador("Zico");
        Jogador pele = new Jogador("Pele");
        Jogador ronaldinho = new Jogador("Ronaldinho");


        fla.comprar(zico);
        fla.comprar(pele);
        fla.comprar(ronaldinho);

        fla.vender(ronaldinho);

         for(String s: fla.getElenco()){
             System.out.println(s);
         }

        System.out.println(fla.quantidadeDeJogadoresNoElenco());

    }
}

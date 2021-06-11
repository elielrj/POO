package POO.Aula07.assosiacao.bidirecional.b.comRestricoes;

public class Teste {
    public static void main(String[] args) {
        Jogador pele = new Jogador("pele");

        Time santos = new Time("Santos");
        Time fla = new Time("flamengo");

        santos.contratar(pele);

        fla.contratar(pele);

        System.out.print("Time do pelé: ");
        System.out.println(pele.nomeTime());

        System.out.print("Jogadores do Flamengo: ");
        for(Jogador jogador: fla.listarJogadores()){
            System.out.println(jogador.obterNome());
        }

        System.out.print("Jogadores do Santos: ");
        for(Jogador jogador: santos.listarJogadores()){
            System.out.println(jogador.obterNome());
        }
    }
}

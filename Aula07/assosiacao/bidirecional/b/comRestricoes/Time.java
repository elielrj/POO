package POO.Aula07.assosiacao.bidirecional.b.comRestricoes;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void contratar(Jogador jogador){
        jogador.desligueseDoTime();
        jogadores.add(jogador);
        jogador.definir(this);
    }

    public void dispensar(Jogador jogador){
        jogadores.remove(jogador);
        jogador.definir(null);
    }
    public String obterNome() {
        return nome;
    }

    //NÃO DEVEMOS RETORNAR UMA LISTA DE OBJETOS!!
    public ArrayList<Jogador> listarJogadores() {
        return jogadores;
    }
}

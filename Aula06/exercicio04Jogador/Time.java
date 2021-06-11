package POO.Aula06.exercicio04Jogador;

import java.util.ArrayList;

public class Time {
    private String nome;

    private ArrayList<Jogador> elenco;

    public Time(String nome){
        this.nome = nome;
        this.elenco = new ArrayList<>();
    }

    public void comprar(Jogador jogador){
        this.elenco.add(jogador);
    }

    public int quantidadeDeJogadoresNoElenco(){
        return elenco.size();
    }

    public void vender(Jogador jogador){
        this.elenco.remove(jogador);
    }

    public ArrayList<String> getElenco() {
        ArrayList<String> lista = new ArrayList<>();

        for(Jogador jogador: elenco){
            lista.add(jogador.nome());
        }
        return lista;
    }
}

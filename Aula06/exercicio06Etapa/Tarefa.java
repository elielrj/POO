package POO.Aula06.exercicio06Etapa;

import java.util.ArrayList;

public class Tarefa {

    private String nome;
    private String descricao;
    private ArrayList<Etapa> listaDeEtapas;



    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.listaDeEtapas = new ArrayList<>();
    }

    public int quantidadeDeEtapas() {
        return listaDeEtapas.size();
    }

    public void adicionar(Etapa etapa) {
        listaDeEtapas.add(etapa);
    }

    public void remover(Etapa etapa) {
        listaDeEtapas.remove(etapa);
    }

    public float percentualConlcuida(){
        return 0;
    }

    public float percentualFaltante(){
        return 100- percentualConlcuida();
    }

    private float percentualTotal(){
        float total = 0;
        for(Etapa etapa: listaDeEtapas){
            total += etapa.getPercentualConcluido();
        }
        return total;
    }

    public ArrayList<Etapa> listarEtapasConcluidas(){
        ArrayList<Etapa> lista = new ArrayList<>();
        for(Etapa etapa: listaDeEtapas){
            if(etapa.estaConcluida())
                lista.add(etapa);
        }
        return lista;
    }

    public ArrayList<Etapa> listarEtapasPendentes(){
        ArrayList<Etapa> lista = new ArrayList<>();
        for(Etapa etapa: listaDeEtapas){
            if(!etapa.estaConcluida())
                lista.add(etapa);
        }
        return lista;
    }
}

package POO.p1.q5.controleDeTarefas;

import java.util.ArrayList;

public class Tarefa {
    private String nome;
    private float percentualConcluiodo;
    private float percentualFaltante;
    private String descricaoDaTarefa;
    private ArrayList<Etapa> etapas;

    public Tarefa(String nome, String descricaoDaTarefa) {
        this.nome = nome;
        this.descricaoDaTarefa = descricaoDaTarefa;
        etapas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricaoDaTarefa() {
        return descricaoDaTarefa;
    }

    public float percentualConcluiodo() {
        for(Etapa etapa: etapas){
            percentualConcluiodo += etapa.percentualConcliodo();
        }
        return percentualConcluiodo = percentualConcluiodo/etapas.size();
    }

    public float percentualFaltante() {
        for(Etapa etapa: etapas){
            percentualFaltante += 100 - etapa.percentualConcliodo();
        }
        return percentualFaltante = percentualFaltante/etapas.size();
    }

    public void adicionarEtapa(Etapa etapa) {
        etapas.add(etapa);
    }

    public ArrayList<Etapa> getEtapas() {
        return etapas;
    }
}

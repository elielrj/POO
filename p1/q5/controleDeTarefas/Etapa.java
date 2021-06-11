package POO.p1.q5.controleDeTarefas;

public class Etapa {
    private float percentualConcluiodo;
    private String descricaoDaExecucao;

    public Etapa(float percentualConcliodo, String descricaoDaExecucao) {
        this.percentualConcluiodo = percentualConcliodo;
        this.descricaoDaExecucao = descricaoDaExecucao;
    }

    public float percentualConcliodo() {
        return percentualConcluiodo;
    }

    public String descricaoDaExecucao() {
        return descricaoDaExecucao;
    }

    public void setPercentualConcliodo(float percentualConcluiodo) {
        this.percentualConcluiodo = percentualConcluiodo;
    }

}

package POO.Aula06.exercicio06Etapa;

public class Etapa {

    private String descricao;
    private float percentualConcluido;

    public Etapa(String descricao){
        this.descricao = descricao;
        this.percentualConcluido = 0;
    }

    public Etapa(String descricao, float percentualConcluido){
        this.descricao = descricao;
        this.percentualConcluido = percentualConcluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPercentualConcluido() {
        return percentualConcluido;
    }

    public boolean estaConcluida(){
        return percentualConcluido == 100;
    }
    public void definirPercentual(float percentualConcluido){
        this.percentualConcluido = percentualConcluido;
    }

    public void concluir(){
        this.percentualConcluido = 100;
    }
}

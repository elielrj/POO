package POO.Aula06.exercicio05Curso;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private  boolean concluida = false;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public boolean concluida(){
        return this.concluida;
    }

    public void concluir(){
        this.concluida = true;
    }
    public int cargaHoraria() {
        return cargaHoraria;
    }
}

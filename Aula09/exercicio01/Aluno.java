package POO.Aula09.exercicio01;

public class Aluno {
    private static int quantidade;
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
        quantidade = quantidade +1;
    }

    public String getNome() {
        return nome;
    }

    public static int getQuantidade() {
        return quantidade;
    }
}

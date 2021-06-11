package POO.Aula09.exercicio03;

public class Aluno {
    private final String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //NÃO PODE ALTERAR COM O "FINAL"
    //public String SetNome() {
    //    this.nome =  nome;
    //}


}

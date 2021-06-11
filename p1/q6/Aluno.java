package POO.p1.q6;

public class Aluno {

    private String nome;
    private Veiculo veiculo;


    public Aluno(String nome, Veiculo veiculo){
        this.nome = nome;
        this.veiculo = veiculo;
    }


    public String nome(){
        return nome;
    }

    public String nomeDoVeiculo(){
        return veiculo.nome();
    }
}
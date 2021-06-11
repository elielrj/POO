package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v3;

public class Funcionario {

    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public double salario() {
        return cargo.rendimentos();
    }

    public String nomeDoCargo() {
        return cargo.nome();
    }
}
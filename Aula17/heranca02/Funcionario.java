package POO.Aula17.heranca02;

public abstract class Funcionario {
    private String nome;
    private double salrio;

    public Funcionario(String nome, double salrio) {
        this.nome = nome;
        this.salrio = salrio;
    }

    public String getNome() {
        return nome;
    }

    public double getSalrio() {
        return salrio;
    }

    public abstract  void metoAbstrato();
}

package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v3;

public class Diretor implements Cargo{
    private String nome;
    private double salario;
    private double bonus;

    public Diretor(String nome, double salario, double bonus) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public double rendimentos() {
        return salario + bonus;
    }
}

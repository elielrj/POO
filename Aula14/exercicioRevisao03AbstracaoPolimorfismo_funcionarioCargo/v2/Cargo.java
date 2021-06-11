package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v2;

public class Cargo {
    private String nome;
    private double salario;
    private double comissao;
    private double bonus;

    public Cargo(String nome, double salario, double comissao, double bonus) {
        this.nome = nome;
        this.salario = salario;
        this.comissao = comissao;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getComissao() {
        return comissao;
    }

    public double getBonus() {
        return bonus;
    }
}

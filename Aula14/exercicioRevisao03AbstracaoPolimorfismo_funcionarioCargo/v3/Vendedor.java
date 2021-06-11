package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v3;

public class Vendedor implements Cargo{
    private String nome;
    private double salario;
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        this.nome = nome;
        this.salario = salario;
        this.comissao = comissao;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public double rendimentos() {
        return salario + comissao;
    }
}

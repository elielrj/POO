package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v1;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private double comissao;
    private double bonus;

    public Funcionario(String nome, String cargo, double salario, double comissao, double bonus) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.comissao = comissao;
        this.bonus = bonus;
    }

    public String nome() {
        return nome;
    }

    public String cargo() {
        return cargo;
    }

    public double salario(){
        if (this.cargo.equalsIgnoreCase("Engenheiro")){
            return salario;
        }
        else if (this.cargo.equalsIgnoreCase("Vendedor")) {
            return salario + comissao;
        }
        else if (this.cargo.equalsIgnoreCase("Gerente")) {
            return salario + bonus;
        }
        else {
            throw new RuntimeException("cargo inváido");
        }

    }
}

package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v2;

public class Funcionario {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String nome() {
        return nome;
    }

    public String cargo() {
        return cargo.getNome();
    }

    public double salario(){
        if (this.cargo.getNome().equalsIgnoreCase("Engenheiro")){
            return cargo.getSalario();
        }
        else if (this.cargo.getNome().equalsIgnoreCase("Vendedor")){
            return cargo.getSalario() + cargo.getComissao();
        }

        else if (this.cargo.getNome().equalsIgnoreCase("Gerente")){
            return cargo.getSalario() + cargo.getBonus();
        }
        else {
            throw new RuntimeException("cargo inválido");
        }

    }
}

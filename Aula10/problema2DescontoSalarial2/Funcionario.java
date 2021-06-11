package POO.Aula10.problema2DescontoSalarial2;

public class Funcionario {
    private float salario;
    private String nome;

    public Funcionario(String nome, float salario) {
        this.salario = salario;
        this.nome = nome;
    }

    public float salario() {
        return salario;
    }
}
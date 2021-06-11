package POO.Aula18.empressa;

public class Programador extends Funcionario{
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double bonificacao() {
        return 150;
    }
}

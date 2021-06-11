package POO.Aula18.empressa;

public class Designer extends Funcionario {
    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double bonificacao() {
        return 100;
    }
}

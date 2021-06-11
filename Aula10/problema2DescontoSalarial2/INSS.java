package POO.Aula10.problema2DescontoSalarial2;

public class INSS implements Desconto {
    @Override
    public float calcula(Funcionario funcionario) {
        return funcionario.salario() * 0.1f;
    }
}

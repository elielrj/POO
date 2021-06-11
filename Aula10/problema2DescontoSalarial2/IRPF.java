package POO.Aula10.problema2DescontoSalarial2;

public class IRPF implements Desconto {
    @Override
    public float calcula(Funcionario funcionario) {
        return funcionario.salario() * 0.2f;
    }
}

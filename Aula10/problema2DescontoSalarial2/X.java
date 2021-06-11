package POO.Aula10.problema2DescontoSalarial2;

public class X implements Desconto{
    @Override
    public float calcula(Funcionario funcionario){
        return funcionario.salario() * 0.9f;
    }
}

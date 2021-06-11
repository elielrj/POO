package POO.Aula10.problema2DescontoSalarial;

public class CalculadoraDeDescontos {
    public float calculaDescontoINSS(Funcionario funcionario) {
        return funcionario.salario() * 0.1f;
    }
}

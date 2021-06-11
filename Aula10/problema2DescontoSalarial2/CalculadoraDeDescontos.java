package POO.Aula10.problema2DescontoSalarial2;

public class CalculadoraDeDescontos {
    public float calculaDesconto(Funcionario funcionario, Desconto desconto) {
        return desconto.calcula(funcionario);
    }
}

package POO.Aula10.problema2DescontoSalarial;

public class Teste {
    public static void main(String[] args) {
        Funcionario ze = new Funcionario("ze", 100);
        float desconto = new CalculadoraDeDescontos().calculaDescontoINSS(ze);
        System.out.println(desconto);
    }
}

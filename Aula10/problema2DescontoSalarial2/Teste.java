package POO.Aula10.problema2DescontoSalarial2;

public class Teste {
    public static void main(String[] args) {
        Desconto desconto = new IRPF();
        desconto = new X();
        desconto = new INSS();

        Funcionario ze = new Funcionario("Ze", 100f);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        float valor = calculadoraDeDescontos.calculaDesconto(ze,desconto);
        System.out.println(valor);

    }
}

package POO.p2.q5;

public class Teste {
    public static void main(String[] args) {

        ContaSalario contaSalario1 = new ContaSalario("a1");
        ContaCorrente contaCorrente1 = new ContaCorrente("b2");
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("c3");

        contaCorrente1.deposita(100);
        System.out.println("Conta corrente: R$ " + contaCorrente1.saldo());

        contaCorrente1.transfere(20, contaPoupanca2);
        System.out.println("Conta poupança: R$ " + contaPoupanca2.saldo());

        contaPoupanca2.transfere(10, contaSalario1);
        System.out.println("Conta salário: R$ " + contaSalario1.saldo());

        SeguroDeVida seguroDeVida1 = new SeguroDeVida("Acabou a vida", 100);

        CalculadoraDeTributos totalDeTributos = new CalculadoraDeTributos(contaCorrente1, seguroDeVida1);
        System.out.println("Total de tributos (CC + Seg Vida): R$ " + totalDeTributos.totalizadorDeTributos());

        CalculadoraDeTributos totalDeTributos2 = new CalculadoraDeTributos(contaCorrente1);
        System.out.println("Total de tributos (somente CC): R$ " + totalDeTributos2.totalizadorDeTributos());

        CalculadoraDeTributos totalDeTributos3 = new CalculadoraDeTributos(contaCorrente1);
        System.out.println("Total de tributos (somente Seg Vida): R$ " + totalDeTributos3.totalizadorDeTributos());

    }
}

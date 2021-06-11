package POO.p2.q4;

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


    }
}

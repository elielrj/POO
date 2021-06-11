package POO.Aula03.exercicio03.conta;

public class Teste {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.depositar(100);

        System.out.println("Valores------------");


        System.out.println("Conta 1 = " + conta1.getSaldo());
        System.out.println("Conta 2 = " + conta2.getSaldo());

        conta1.transferir(50, conta2);

        System.out.println("Valores------------");

        System.out.println("Conta 1 = " + conta1.getSaldo());
        System.out.println("Conta 2 = " + conta2.getSaldo());

    }
}

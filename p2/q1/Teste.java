package POO.p2.q1;

public class Teste {

        public static void main(String[] args) {
            Conta contaCorrente = new Corrente();
            Conta contaPoupanca = new Poupanca();

            //DEPÓSITOS
            System.out.println("DEPÓSITOS:");
            contaCorrente.depositar(100);
            contaPoupanca.depositar(100);
            System.out.println(contaCorrente.getSaldo());
            System.out.println(contaPoupanca.getSaldo());

            //TRANSFERÊNCIAS
            System.out.println();
            System.out.println("TRANSFERÊNCIAS:");
            contaPoupanca.transferir(50, contaCorrente);
            contaCorrente.transferir(50,contaPoupanca);
            System.out.println(contaCorrente.getSaldo());
            System.out.println(contaPoupanca.getSaldo());

            //SAQUES
            System.out.println();
            System.out.println("SAQUES:");
            contaPoupanca.sacar(50);
            contaCorrente.sacar(50);
            System.out.println(contaCorrente.getSaldo());
            System.out.println(contaPoupanca.getSaldo());

            //TRANSFERÊNCIAS > QUE SALDOS
            System.out.println();
            System.out.println("TRANSFERÊNCIAS > QUE SALDOS:");
            contaPoupanca.transferir(200, contaCorrente);
            contaCorrente.transferir(200,contaPoupanca);
            System.out.println(contaCorrente.getSaldo());
            System.out.println(contaPoupanca.getSaldo());

            //SAQUES > QUE SALDOS
            System.out.println();
            System.out.println("SAQUES > QUE SALDOS:");
            contaPoupanca.sacar(160);
            contaCorrente.sacar(160);
            System.out.println(contaCorrente.getSaldo());
            System.out.println(contaPoupanca.getSaldo());

        }

}

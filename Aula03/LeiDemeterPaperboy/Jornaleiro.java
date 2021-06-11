package POO.Aula03.LeiDemeterPaperboy;

public class Jornaleiro {

    public void cobrarCliente(Cliente cliente, float valorDevido) {
        if (cliente.pagar(valorDevido)) {
            System.out.println("Client pagou!");
        } else {
            System.out.println("Cliente não pagou!");
        }
    }
}

package POO.Aula03.OEntregadorJornalSuaCarteira;

public class Jornaleiro {

    public void cobrarCliente(Cliente cliente, float valorDevido) {
        float valorPago = cliente.pagar(valorDevido);
        if (valorPago == valorDevido) {
            System.out.println("Sucesso! Dívida paga");
        } else {
            System.out.println("Ops. Volte depois!");
        }
    }
}


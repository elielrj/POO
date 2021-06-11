package POO.p1.q10;

public class Jornaleiro {
    public void cobrarCliente(Cliente cliente, float valorDevido) {
        if (cliente.getMinhaCarterira().getTotalDinheiro() > valorDevido) {
            cliente.getMinhaCarterira().tirarDinheiro(valorDevido);
            System.out.println("sucesso");
        } else {
            System.out.println("fracasso");
        }
    }
}

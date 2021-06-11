package POO.Aula03.LeiDemeterPaperboy;

public class Teste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Zé");
        cliente.comprarCarteira();
        cliente.adicionarQuantiaNaCarteira(10);

        cliente.comprarCarteira();

        cliente.perderCarteira();
        Jornaleiro jornaleiro = new Jornaleiro();

        jornaleiro.cobrarCliente(cliente, 2);
    }
}
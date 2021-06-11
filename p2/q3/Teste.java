package POO.p2.q3;

public class Teste {
    public static void main(String[] args) {

        //FITAS
        Infantil fitaInfantil1 = new Infantil("Pequeno Príncipe");
        Infantil fitaInfantil2 = new Infantil("Pokemon");

        Normal fitaNormal1 = new Normal("Escorpião Rei");
        Normal fitaNormal2 = new Normal("Matrix");

        Lancamento fitaLancamento1 = new Lancamento("Outro Nível");
        Lancamento fitaLancamento2 = new Lancamento("Prova de POO");

        //LOCAÇÕES
        Locacao locacao1 = new Locacao(fitaInfantil1, 1);
        Locacao locacao2 = new Locacao(fitaInfantil2, 4);
        Locacao locacao3 = new Locacao(fitaNormal1, 2);
        Locacao locacao4 = new Locacao(fitaNormal2, 5);
        Locacao locacao5 = new Locacao(fitaLancamento1, 3);
        Locacao locacao6 = new Locacao(fitaLancamento2, 6);

        //CLIENTE
        Cliente cliente1 = new Cliente("José");

        cliente1.adicionaAluguel(locacao1);
        cliente1.adicionaAluguel(locacao2);
        cliente1.adicionaAluguel(locacao3);
        cliente1.adicionaAluguel(locacao4);
        cliente1.adicionaAluguel(locacao5);
        cliente1.adicionaAluguel(locacao6);

        System.out.println(cliente1.extrato());
    }
}

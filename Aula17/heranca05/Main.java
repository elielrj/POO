package POO.Aula17.heranca05;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();

        Venda venda = new Venda();

        venda.adicionar(item);

        System.out.println(venda.quantidade());
    }
}

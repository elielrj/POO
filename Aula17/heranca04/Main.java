package POO.Aula17.heranca04;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();

        Venda venda = new Venda();

        venda.add(item);

        System.out.println(venda.size());
    }
}

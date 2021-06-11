package POO.p1.q11;

public class Teste {
    public static void main(String[] args) {
        Produto carne = new Produto(1);
        Produto cerveja = new Produto(1);

        Item itemCarne = new Item(carne, 20);
        Item itemCerveja = new Item(cerveja, 10);

        Pedido pedido1 = new Pedido();

        pedido1.adicione(itemCarne);
        pedido1.adicione(itemCerveja);


        for(Item item: pedido1.getItens()){
            System.out.println(item.getPesoDoProduto() + " - " + item.getQuantidade());
        }


        System.out.println("Peso total do produto: " + pedido1.pesoTotal());
        System.out.println("Quantidade de iten do pedido: " + pedido1.quantidade());

    }
}

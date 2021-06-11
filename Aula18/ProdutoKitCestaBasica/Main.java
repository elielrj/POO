package POO.Aula18.ProdutoKitCestaBasica;

public class Main {
    public static void main(String[] args) {
        Produto carne = new Produto("carne", 10);
        Produto arroz = new Produto("ARROZ", 10);

        Kit cestaBasica = new Kit();

        cestaBasica.adicionar(new Item(carne));
        cestaBasica.adicionar(new Item(arroz));

        Item itemCarne = new Item(carne, 2);
        Item itemArroz = new Item(arroz, 2);
        Item itemCesta = new Item(cestaBasica, 1);

        Venda venda = new Venda();

        venda.adicionar(itemArroz);
        venda.adicionar(itemCarne);
        venda.adicionar(itemCesta);

        System.out.println(venda.total());

        for(Item item: venda.getItens()){
            System.out.println(item.nome());
            System.out.println(item.preco());
            System.out.println(item.getQuantidade());
        }
    }

}

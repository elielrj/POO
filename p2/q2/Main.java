package POO.p2.q2;

public class Main {
    public static void main(String[] args) {
        Produto carne = new Produto("carne", 10);
        Produto arroz = new Produto("ARROZ", 10);

        Kit cestaBasica = new Kit();

        Servico servicoDeCorteDeCabelo = new Servico("Corte de cabelo", 5.00);
        Servico servicoDeLimpezaDoCarro = new Servico("Limpeza do carro", 65.00);

        cestaBasica.adicionar(new Item(carne));
        cestaBasica.adicionar(new Item(arroz));
        cestaBasica.adicionar(new Item(servicoDeCorteDeCabelo));

        Item itemCarne = new Item(carne, 2);
        Item itemArroz = new Item(arroz, 2);
        Item itemCesta = new Item(cestaBasica, 1);
        Item itemLimpezaDoCarro = new Item(servicoDeLimpezaDoCarro, 2);

        Venda venda = new Venda();

        venda.adicionar(itemArroz);
        venda.adicionar(itemCarne);
        venda.adicionar(itemCesta);
        venda.adicionar(itemLimpezaDoCarro);


        System.out.println("Total------>" + venda.total());
        System.out.println();

        int i = 1;
        for(Item item: venda.getItens()){
            System.out.println("<Item> " + i);
            System.out.print("Nome: " + item.nome());
            System.out.print(" R$: " + item.preco() + " ");
            System.out.print(" Qtd: " + item.getQuantidade());
            System.out.println();
            i++;
        }
    }

}

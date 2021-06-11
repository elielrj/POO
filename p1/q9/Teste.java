package POO.p1.q9;

public class Teste {
    public static void main(String[] args) {

        //CESTA BÁSICA
        CestaBasicaTipoI cesta1 = new CestaBasicaTipoI();

        //CESTA HIGIÊNICA
        CestaHigienica cesta2 = new CestaHigienica();

        //PRODUTO 8
        Produto produto8 = new Produto("Canela em pó", 3);
        Item item8 = new Item(produto8, 5);

        //CRIAÇÃO DE VENDA
        Venda venda1 = new Venda();

        venda1.adicione(item8);


        //ADIÇÃO DA CESTA BÁSICA A VENDA I
        for(Item item: cesta1.itens()) {
            venda1.adicione(item);
        }

        //ADIÇÃO DA CESTA HIGIÊNICA A VENDA I
        for(Item item: cesta2.itens()) {
            venda1.adicione(item);
        }

        for(Item item: venda1.getItens()){
            System.out.println("Descrição: " + item.getNomeProtuto() + " - Peço: " + item.getPrecoDoProduto() + " - Quantidade: " + item.getQuantidadeDoProduto() + " - Sub Total: " + item.subTotal());
        }
        System.out.println("Total= " + venda1.total());
    }
}

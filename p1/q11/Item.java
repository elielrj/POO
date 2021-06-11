package POO.p1.q11;

public class Item {
    private Produto produto;
    private int quantidade;


    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    /** ERREI...
    public Produto getProduto() {
        return produto;
    }
    */
    public int getQuantidade() {
        return quantidade;
    }

    public double getPesoDoProduto() {
        return produto.getPeso() ;
    }
}

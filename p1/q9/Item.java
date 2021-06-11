package POO.p1.q9;

public class Item {
    private Produto produto;
    private int quantidade;



    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public float subTotal(){
        return produto.getPreco() * quantidade;
    }

    public String getNomeProtuto() {
        return produto.getNome();
    }

    public float getPrecoDoProduto() {
        return produto.getPreco();
    }

    public int getQuantidadeDoProduto() {
        return quantidade;
    }
}
